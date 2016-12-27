<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ztree 菜单</title>
<link rel="stylesheet" href="ztree/css/zTreeStyle/zTreeStyle.css">
<script src="ztree/js/jquery-3.1.1.min.js"></script>
<script src="ztree/js/jquery.ztree.all.min.js"></script>
<script src="ztree/js/jquery.ztree.core.min.js"></script>
</head>
<body>

<div>
	<ul id="tree" class="ztree" style="width:260px; overflow:auto;"></ul>
	<IFRAME ID="mainIframe" Name="mainIframe" FRAMEBORDER=0 SCROLLING=AUTO width=100%  height=600px SRC="main.html"></IFRAME>
</div>

<script>
$(document).ready(function(){
	var zTree;
	var hrefIframe;
	var setting = {
		view: {
			dblClickExpand: false,
			showLine: true,
			selectedMulti: false
		},
		async:{
			enable:true,
			contentType:"application/json",
			dataType:"json",
			url:"/j-web-ztree/menu",
			type:"post"
		},
		data: {
			simpleData: {
				enable:true,
				idKey: "id",
				pIdKey: "pId",
				rootPId: ""
			}
		},
		callback: {
			beforeClick: function(treeId, treeNode) {
				var zTree = $.fn.zTree.getZTreeObj("tree");
				if (treeNode.isParent) {
					zTree.expandNode(treeNode);
					return false;
				} else {
					hrefIframe.attr("src",treeNode.file + ".html");
					return true;
				}
			}
		}
	};
//  初始化
	var t = $("#tree");
	t = $.fn.zTree.init(t, setting, null);
	hrefIframe = $("#mainIframe");
	hrefIframe.bind("load", loadReady);
	var zTree = $.fn.zTree.getZTreeObj("tree");
	zTree.selectNode(zTree.getNodeByParam("id", 101));
	
	function loadReady() {
		var bodyH = hrefIframe.contents().find("body").get(0).scrollHeight,
		htmlH = hrefIframe.contents().find("html").get(0).scrollHeight,
		maxH = Math.max(bodyH, htmlH), minH = Math.min(bodyH, htmlH),
		h = hrefIframe.height() >= maxH ? minH:maxH ;
		if (h < 530) h = 530;
		hrefIframe.height(h);
	}

});
</script>
</body>
</html>