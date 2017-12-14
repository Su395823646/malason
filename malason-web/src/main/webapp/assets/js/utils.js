
function getContextPath() {
	var pathName = document.location.pathname;

	var curWwwPath = window.document.location.href;
	var pos = curWwwPath.indexOf(pathName);

	var localhostPath = curWwwPath.substring(0, pos);

	var length = pathName.split("/");

	var result = '';
	if (length.length > 3) {
		if (length[1] != 'index') {
			result = '/' + length[1];
		}
	}

	return (localhostPath + result);
}

function getBasePath() {
	var pathName = document.location.pathname;

	var length = pathName.split("/");

	var result = '';
	if (length.length > 3) {
		if (length[1] != 'index') {
			result = '/' + length[1];
		}
	}
	return result;
}

$.utils = {
	/**
	 * 时间格式化 formatStr 为“yyyy-MM-dd” dateTime 为日期类型
	 */
	dateFormat : function(formatStr, dateTime) {

		var str = formatStr;
		var Week = [ '日', '一', '二', '三', '四', '五', '六' ];

		str = str.replace(/yyyy|YYYY/, dateTime.getFullYear());
		str = str
			.replace(/yy|YY/, (dateTime.getYear() % 100) > 9 ? (dateTime
				.getYear() % 100).toString() : '0'
			+ (dateTime.getYear() % 100));

		str = str.replace(/MM/,
			dateTime.getMonth() > 8 ? dateTime.getMonth() + 1 : '0'
			+ (dateTime.getMonth() + 1));
		str = str.replace(/M/g, dateTime.getMonth() + 1);

		str = str.replace(/w|W/g, Week[dateTime.getDay()]);

		str = str.replace(/dd|DD/, dateTime.getDate() > 9 ? dateTime.getDate()
			.toString() : '0' + dateTime.getDate());
		str = str.replace(/d|D/g, dateTime.getDate());

		str = str.replace(/hh|HH/, dateTime.getHours() > 9 ? dateTime
			.getHours().toString() : '0' + dateTime.getHours());
		str = str.replace(/h|H/g, dateTime.getHours());
		str = str.replace(/mm/, dateTime.getMinutes() > 9 ? dateTime
			.getMinutes().toString() : '0' + dateTime.getMinutes());
		str = str.replace(/m/g, dateTime.getMinutes());

		str = str.replace(/ss|SS/, dateTime.getSeconds() > 9 ? dateTime
			.getSeconds().toString() : '0' + dateTime.getSeconds());
		str = str.replace(/s|S/g, dateTime.getSeconds());
		return str;
	},
	
	submit : function(controllerURL, formId, dialogId, errMsg, data,
					  refreshTable, dialogShow, sucMsg) {

		var reqData = null;
		var that = this;

		if (formId) {
			reqData = $(formId).serialize();
		} else {
			reqData = data;
		}
		$.ajax({
			type : "post",
			url : getContextPath() + controllerURL,
			dataType : 'json',
			data : reqData,
			async : true,
			success : function(response) {
			
					if (response == true) {
						if (refreshTable) {
							$(refreshTable).bootstrapTable('refresh');
						}
						if (!dialogShow) {
							$(dialogId).modal('hide');
						}
						if (sucMsg) {
							that.alertSuccess(sucMsg);
						}
					} else {
						$.utils.alertWarning("操作失败!");
					}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				$.util.alertError('AJAX出错');
			}
		});
	},
	alertError : function(msg, options) {
		BootstrapDialog.alert({
			type : 'type-danger',
			title : '错误',
			buttonLabel : '确定',
			message : msg,
			draggable: true
		});
	},
	alertSuccess : function(msg, options) {
		BootstrapDialog.alert({
			type : 'type-success',
			title : '正确',
			buttonLabel : '确定',
			message : msg,
			draggable: true
		})
	},
	alertWarning : function(msg, options) {
		BootstrapDialog.alert({
			type : 'type-warning',
			title : '警告',
			buttonLabel : '确定',
			message : msg,
			draggable: true
		});
	},
	alertInfo : function(msg, options) {
		BootstrapDialog.alert({
			type : 'type-info',
			title : '信息',
			buttonLabel : '确定',
			message : msg,
			draggable: true
		});
	},
	objToJson : function(obj) {
		return JSON.stringify(obj);

	}
};

/** 将表单序列化为一个json对象，只支持单个值的控件 */
$.fn.serializeFormToJson = function() {
	var serializeObj={};
    $(this.serializeArray()).each(function(){  
        serializeObj[this.name]=this.value;  
    });  
    return serializeObj; 
}

