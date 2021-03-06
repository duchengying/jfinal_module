$(document).ready(function(){
	var zTree;
	var hrefIframe;
	var setting = {
		view: {
			dblClickExpand: false,
			showLine: true,
			selectedMulti: false
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

	var zNodes =[
		{id:1, pId:0, name:"[core] 基本功能 演示", open:true},
		{id:101, pId:1, name:"最简单的树 --  标准 JSON 数据", file:"core/standardData"},
		{id:110, pId:1, name:"用 zTree 方法 更新 节点数据", file:"core/update_fun"},
		{id:111, pId:1, name:"单击 节点 控制", file:"core/click"},
		{id:112, pId:1, name:"展开 / 折叠 父节点 控制", file:"core/expand"},

		{id:6, pId:0, name:"其他扩展功能 演示", open:false},
		{id:601, pId:6, name:"隐藏普通节点", file:"exhide/common"},
		{id:602, pId:6, name:"配合 checkbox 的隐藏", file:"exhide/checkbox"},
		{id:603, pId:6, name:"配合 radio 的隐藏", file:"exhide/radio"}
	];
	
//    初始化
	var t = $("#tree");
	t = $.fn.zTree.init(t, setting, zNodes);
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

