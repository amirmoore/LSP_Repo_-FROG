package org.howard.edu.lsp.midterm.question1;

public class Book { // attributes of all books
		private String title;
		private String author;
		private String ISBN;
		private int yearPublished;
		
		// construct the book (task 1)
		public Book(String title, String author,String ISBN, int yearPublished) {
			this.title = title;
			this.author = author;
			this.ISBN = ISBN;
			this.yearPublished = yearPublished;
			}
		
		public String getTitle() { // getter Title 
			return title;
		}
		
		public void setTitle(String title) { // setter title
			this.title = title;
		}
		
		public String getAuthor() { // getter author
			return author;
		}
		
		public void setAuthor(String author) { // setter author
			this.author = author;
		}
		
		public String getISBN() { // getter ISBN
			return ISBN;
		}
		
		public void setISBN(String ISBN) { // setter ISBN
			this.ISBN = ISBN;
		}
		
		public int getYearPublished() { // Getter Year Published
			return yearPublished;
		}
		public void setYearPublished(int yearPublished) { // Setter year Published
			this.yearPublished = yearPublished;
		}
		
		
		
		// override equals to compare book; ISBN and Author (task 2)
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null || getClass() != obj.getClass()) {
				return false;
			}
			Book book = (Book) obj;
			return ISBN.equals(book.ISBN) && author.equals(book.author);
			
		}
		
		// override "String toString()" to return string of book obj; print book info (task 3)
		@Override
		public String toString() {
			return "title: " + title + ", author: " + author + ", ISBN: " + ISBN + ", year published: " + yearPublished;
					}
	
}
