package com.bookapp.repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository // from here connect to db
public class BookRepositoryImpl implements IBookRepository{
	
	
	private JdbcTemplate jdbcTemplate;
	
	
	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		Object[] bookArr = {book.getTitle(),book.getAuthor(),book.getCategory(),book.getPrice(),book.getBookId()};
		jdbcTemplate.update(Queries.INSERTQUERY,bookArr);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY,price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY,bookId);
		
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book = jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,new BookMapper(),bookId);
		return book;
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books  = jdbcTemplate.query(Queries.SELECTQUERY,mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY,(rs,rowNum)->{
			Book book = new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("bookId"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		},author);	
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByCategory = jdbcTemplate.query(Queries.SELECTBYCATEGORYQUERY,mapper,category);
		return booksByCategory;
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByPrice = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY,mapper,price);
		return booksByPrice;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByAuthCat = jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY,mapper,author,category);
		return booksByAuthCat;
	}

}
