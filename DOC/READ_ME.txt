Java là một ngôn ngữ hướng đối tượng và cũng là một nền tảng để xây dựng một trang web.
-> Ở thư mục này là tập hợp tất cả kiến thức, tài liệu quan trọng và câu hỏi phỏng vấn mà anh em ở FWA.EC đã lưu lại.
Nội dung lần lượt như sau:

1, Tìm hiểu về Java Core (OOP, Collection,...) và compiler hoạt động của nó.
	+) Introduction: giới thiệu compiler, biến (Nguyên thuỷ hoặc object),... 
	+) Flow Control: If...else, while loop. 
	+) Arrays
	+) OOP: Trừu tượng , đóng gói, kế thừa ,đa hình. 
	+) Exception
	+) Collection:  

2, Để xây dựng một ứng dụng Web, cần phải hiểu được Servlet(Back-end) và JSP(Front-end) vì đây là cơ chế hoạt động cốt lõi trong Java để xây dựng lên một nền tảng web.
	+) Tổng quan về JSP, implicit object và scope của JSP.
	+) Nắm rõ kiến trúc Servlet, bản chất hoạt động, vòng đời và các method quan trọng trong Servlet.
	+) Khái niệm về Session, Cookie và phân biệt chúng.
	+) Web filter.

3, Nắm rõ được những khái niệm cơ bản về SQL và các câu lệnh, từ đó tìm hiểu dần những cách thức giao tiếp giữa Servlet và database như JDBC, Hibernate, ...
	+) Khái niệm về ERD (Entity Relationship Diagrams)
	+) Chuyển đổi ERD sang Relational DB Schema.
	+) Các câu lệnh tạo, truy vấn, sửa, xoá dữ liệu -> LINK: https://openplanning.net/10237/huong-dan-hoc-sql-cho-nguoi-moi-bat-dau-voi-mysql#a23767
	+) Sử dụng JDBC để thao tác giữa Servlet và database.
	+) Sử dụng JPA, Hibernate và một số framework thay thế cho JDBC thuần.

4, Tìm hiểu về framework Spring, Spring MVC và Spring Boot
-Spring Core:
	+) Khái niệm IoC và dependency injection
	+) Nguyên tắc hoạt động của Spring
	+) Sử dụng Maven để cài Spring Framework
	+) Bean
-Spring MVC:
	+) Cơ chế hoạt động và các bước trong Spring MVC.
	+) Nắm rõ một số @annotation quan trọng như @controller, @repository, @service
	+) Các bước cấu hình trong Spring MVC
	+) Front-controller, Interceptor & ModelAndView.
-Spring-boot: Đây là 1 framework phát triển dựa trên Spring MVC và Spring core, nhằm giảm tối đa những config phức tạp và những hạn chế mà Spring MVC để lại. Spring Boot cũng là tiền đề để phát triển lên MicroService
	+) Tất cả khái niệm về Spring Boot
	+) Phân biệt WebApp và Restful web service
	+) Spring-Boot Admin để xây dựng lên MicroService

5, Tìm hiểu UML Diagram để thiết kế cho project
	+) Use case
	+) Sequence
	+) Class 