<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<form:errors path="*"></form:errors>
				<h1 class="text-center mb-3">Change Product Details</h1>

				<form action="${pageContext.request.contextPath }/handle-product"
					method="post">
					<input type="text" value="${product.id }"  hidden name="id">
					<div class="form-group">
						<label for="name" id="inputlabel">Product Name</label> <input
							type="text" class="form-control" name="name"
							placeholder="Enter Product Name here" required
							value="${product.name}">
					</div>

					<div class="form-group">
						<label for="description" id="desclabel">Product
							Description</label>
						<textarea rows="5" class="form-control" name="description"
							id="description" placeholder="Enter Description" required>${product.description }
							</textarea>

					</div>
					<div class="form-group">
						<label for="price" id="pricelabel">Product Price</label> <input
							type="text" class="form-control" name="price"
							placeholder="Enter Product Price here" required id="price"
							value="${product.price }" />
					</div>

					<!--  -->
					<div class="container text-center">
						<a href="${pageContext.request.contextPath } "
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-warning">Update
							Product</button>

					</div>

				</form>
			</div>
		</div>
	</div>

</body>
</html>