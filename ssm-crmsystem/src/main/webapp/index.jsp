<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>booleanbl 公众号 客户关系管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link id="themeLink" rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">

	<style type="text/css">
		ul{
			line-height: 30px;
		}
	</style>
  </head>
  
  <body class="easyui-layout"> 
  	 <!-- 顶部 --> 
    <div data-options="region:'north',split:true" style="height:80px;">
    	
    	<!-- logo -->
    	<div id="logo">
    		<img src="images/20191223003101.png"/>
    	</div>
    	
    	<!-- 登录用户信息 -->
    	<div id="loginDiv" style="position: absolute;right: 20px;top: 20px;">
    		 欢迎你，[超级管理员],你使用[192.156.21.22]IP登录!
    	</div>
    	
    	<div id="themesDiv" style="position: absolute;right: 20px;top:40px;">
	    	<a href="javascript:void(0)" id="mb" class="easyui-menubutton"     
			        data-options="menu:'#Themesmeus',iconCls:'icon-edit'">切换风格</a>   
			<div id="Themesmeus" style="width:150px;">   
			    <div>default</div>   
			    <div>gray</div>   
			    <div>black</div>   
			    <div>bootstrap</div>   
			    <div>material</div>   
			    <div>metro</div>   
			</div>  
		</div>		
    </div>   
    
    <!-- 底部 -->
    <div data-options="region:'south',split:true" style="height:30px;">
    	<div id="copyrightDiv" style="text-align: center;">
    		booleanbl出品&copy;2018版权所有
    	</div>
    </div>   
    
     <!-- 左边系统菜单 -->
    <div data-options="region:'west',title:'系统菜单',split:true" style="width:200px;">
    	<div id="aa" class="easyui-accordion" style="width:193px;" data-options="border:0,multiple:true" >   
		    <div title="系统管理" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">   
		       <ul>
		       	 <li><a href="javascript:void(0)" pageUrl="categroy.jsp">员工管理</a></li>
		       </ul>
		    </div>   
		    <div title="商品管理" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
		       <ul>
		       	 <li><a href="javascript:void(0)" pageUrl="customer_manage.jsp">客户管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="linkman_manage.jsp">联系人管理管理</a></li>
		       </ul>
		    </div>     
		</div>  
    </div>   
    
    <!-- 中间编辑区域 -->
    <div data-options="region:'center'" style="padding:5px;background:#eee;">
    	<div id="tt" class="easyui-tabs" style="width:500px;height:250px;" data-options="fit:true">   
		    <div title="起始页" style="padding:20px;display:none;">   
		       欢迎登录booleanbl客户关系管理系统
		    </div>     
		</div>  
    </div> 
    
    
    <script type="text/javascript">
    	$(function(){
    		//给a标签绑定时间
    		$("a[pageUrl]").click(function(){
    			//1.获取pageUrl属性值（需要跳转的页面地址）
    			var pageUrl = $(this).attr("pageUrl");
    			//获取a标签的内容，标题
    			var title = $(this).text();

    			//2.判断是否存在指定标题的选项卡
    			if( $("#tt").tabs("exists",title)  )  {
	    			//3.如果存在，则选项该选项卡
    				$("#tt").tabs("select",title);				
    			}else{
	    			//4.如果不存在，则添加选项卡
    				$("#tt").tabs("add",{
    					title:title,
    					content:"<iframe src='"+pageUrl+"' width='100%' height='100%' frameborder='0'><iframe>",
    					closable:true
    				});				
    			}
    		});
    		
    		//点击切换模块菜单的时候，进行切换模块
    		$("#Themesmeus").menu({
    			onClick:function(item){
    				//1.获取需要改变的模块名称
    				var themeName = item.text;
    				
    				//2.获取link标签的href属性
    				var href= $("#themeLink").attr("href");
    				
    				//3.更改href的属性值
    				// easyui/themes/default/easyui.css
    				href = href.substring(0,href.indexOf("themes"))+"themes/"+themeName+"/easyui.css";
    				
    				//4.更新link的href属性
    				$("#themeLink").attr("href",href);
    			}
    		});
    	});
    
    </script>  
  </body>  
</html>
