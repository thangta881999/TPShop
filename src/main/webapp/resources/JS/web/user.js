$(document).ready(function(){
	$(window).scroll(function(){
	// 	$("#form-user").css({
	// 		"height": $(".product").width()+180
	// 	})
	// });
	// $(window).resize(function(){
	// 	$("#form-user").css({
	// 		"height": $(".product").width()+180
	// 	})
	});
	$(".main-content").css({
		"margin-top": $(".banner-top").outerHeight()
	})
	$(window).resize(function(){
		$(".main-content").css({
			"margin-top": $(".banner-top").outerHeight()
		})
	});
	$("#btn-capnhat").click(function() {
		$("#userName").attr("readOnly",false);
		$("#fullName").attr("readOnly",false);
		$("#phone").attr("readOnly",false);
		$("#password").attr("readOnly",false);
		var passwordTemp = $("#password").val();
		$("#password").val("Nhập lại mật khẩu");
		$("#btn-ok").removeClass("hidden");
		$("#btn-thoat").removeClass("hidden");
		$("#btn-capnhat").addClass("hidden");
		$(".password1").removeClass("hidden");
		$(".password2").removeClass("hidden");
	});
	$("#btn-thoat").click(function() {
		location.reload();
	});
	$("#btn-ok").click(function() {
		if ($("#password1").val()===$("#password2").val()) {
			var formData = $("#form-user").serializeArray();
			console.log(formData);
			var json={};
			json["userName"]=formData
			$.ajax({
				url: "/api/user",
				type: "POST",
				contentType: "application/json",

				data: JSON.stringify(json),
				success: function (res) {
					location.reload();
				},
				error: function() {
					swal("Error!", "Plese complete & check again input form", "error");
				}
			});
		}
	});


});

