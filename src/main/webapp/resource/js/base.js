(function($) {
	$(window).load(function() {
		$("a[rel='load-content']").click(function(e) {
			e.preventDefault();
			var url = $(this).attr("href");
			$.get(url, function(data) {
				$(".content .mCSB_container").append(data);
				$(".content").mCustomScrollbar("scrollTo", "h2:last");
			});
		});
		$(".content").delegate("a[href='top']", "click", function(e) {
			e.preventDefault();
			$(".content").mCustomScrollbar("scrollTo", $(this).attr("href"));
		});
	});
})(jQuery);

function changeCheckbox() {
	$("input[name='ckbox']").each(function() {
		this.checked = !this.checked;
	});
}

function createJavaCodeInTable() {
	postbase('../generate/javaCodeGenerateInTable.htm');
}
function createJavaCodeInExcel() {
	postbase('../generate/javaCodeGenerateInExcel.htm');
}
function createSqlInExcel() {
	postbase('../generate/sqlGenerateInExcel.htm');
}
function postbase(url) {
	var checkArray = new Array()
	var index = 0;
	$("input[name='ckbox']").each(function() {
		if(this.checked){
			checkArray[index] = $(this).val();
			index++;
		}
	});
	if (0 < checkArray.length) {
		$.ajax({
			type : "post",
			url : url,
			contentType : 'application/json;charset=UTF-8',
			dataType : "json",
			data : JSON.stringify(checkArray),
			success : function(data) {
				alert("success");
			},
			error : function(data, status, e) {
				alert("fail retry");
			}
		});
	} else {
		alert("请选择再确定");
	}
}