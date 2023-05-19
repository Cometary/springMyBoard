<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="tommy.spring.web.board.impl.BoardDAO"%>
<%@ page import="tommy.spring.web.board.BoardVO"%>
<%@ page import="java.util.List"%>
<%
// 세션에 저장된 글 목록을 추출
List<BoardVO> boardList = (List<BoardVO>) session.getAttribute("boardList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/myboard/resources/css/style.css" rel="stylesheet" />
<title>Board List</title>
</head>
<body>
	<h1>글 목록</h1>
	<hr>
	<h3>
		테스트 회원님 환영합니다.<a href="logout.do">Log-Out</a>
	</h3>
	<!-- 검색 시작 -->
	<form action="getBoardList.jsp" method="post">
		<table>
			<tr>
				<td><select class="box" name="searchCondition">
						<option value="TITLE">제목</option>
						<option value="CONTENT">내용</option>
				</select></td>
				<td><input type="text" name="searchKeyword" /></td>
				<td><input type="submit" value="검색" /></td>
			</tr>
		</table>
	</form>
	<br />
	<!-- 검색 종료 -->
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<%
		for (BoardVO board : boardList) {
		%>
		<tr>
			<td><%=board.getSeq()%></td>
			<td><a href="getBoard.do?seq=<%=board.getSeq()%>"><%=board.getTitle()%></a>
			</td>
			<td><%=board.getWriter()%></td>
			<td><%=board.getRegDate()%></td>
			<td><%=board.getCnt()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<br />
	<a href="insertBoard.jsp"><input type="submit" value="새글 작성" /></a>
</body>
</html>