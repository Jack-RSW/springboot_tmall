# Springboot_Tmall开发

该项目需要有Springboot/java/Maven/Jpa/ElasticSearch/shiro/MySQL/redis/Thymeleaf/Bootstrap/vue/Jquery等基本概念

# 关于项目

## 测试环境

```
后端：springboot+jpa
测试环境：IDEA + tomcat8 + mysql5.1.6 + jdk8 + maven
前端：thymeleaf+vue+Bootstrap+Jquery
```

## 技术栈

- 1.存储层技术：JPA
- 2.控制层技术：Spring MVC
- 3.项目格式：maven
- 4.web服务器：tomcat
- 5.前端框架：vue.js，bootstrap
- 6.模板技术：thymeleaf
- 7.异步处理：axios.js
- 8.前后端分离
- 9.使用标准的restful风格
- 10.动静分离，使用nginx实现
- 11.安全框架通过shiro实现
- 12.缓存通过redis实现
- 13.搜索引擎通过elastic search实现

## 项目功能

- 前台：

  1 : 首页 
  2 : 分类页 
  3 : 查询结果页
  4 : 产品页
  5 : 结算页面
  6 : 支付页面
  7 : 支付成功页面 
  8 : 购物车页面 
  9 : 我的订单页面 
  10 : 确认收货页面 
  11 : 确认收货成功页面
  12 : 进行评价页面
  13 : 登录页面
  14 : 注册页面

- 后台：

  1 : 分类管理
  2 : 分类属性管理
  3 : 产品管理
  4 : 产品属性设置
  5 : 产品图片管理
  6 : 用户管理
  7 : 订单管理

## 项目运行步骤

1. 因为springboot 版用到了 redis 和 elasticsearch，所以启动过程，请务必按照顺序启动
2. 不同软件之间存在兼容问题，如果您本机已经装有了 redis或者 elasticsearch 或者 kibana, 但是版本不对，请暂停本机版本，使用项目中提供的版本
3. 启动顺序请按照批处理前的序号，依次启动 
  3.1 1-redis.bat
  3.2 2-elasticsearch.bat
  3.3 3.kibana.bat
  3.4 4-tomcat.bat
4. 启动之后访问地址：
  前台演示：
  http://127.0.0.1:8080/springboot_tmall/home
  后台管理：
  http://127.0.0.1:8080/springboot_tmall/admin_category_list
5. 如果有配置nginx，需要更改上述的8080端口为nginx.conf中配置的端口

## 项目结构

```
│  README.md
│  pom.xml
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─jack
│  │  │          └─tmall
│  │  │              │  Application.java
│  │  │              │  
│  │  │              ├─comparator
│  │  │              │      ProductAllComparator.java
│  │  │              │      ProductDateComparator.java
│  │  │              │      ProductPriceComparator.java
│  │  │              │      ProductReviewComparator.java
│  │  │              │      ProductSaleCountComparator.java
│  │  │              │      
│  │  │              ├─config
│  │  │              │      CORSConfiguration.java
│  │  │              │      RedisConfig.java
│  │  │              │      ShiroConfiguration.java
│  │  │              │      WebMvcConfigurer.java
│  │  │              │      
│  │  │              ├─dao
│  │  │              │      CategoryDAO.java
│  │  │              │      OrderDAO.java
│  │  │              │      OrderItemDAO.java
│  │  │              │      ProductDAO.java
│  │  │              │      ProductImageDAO.java
│  │  │              │      PropertyDAO.java
│  │  │              │      PropertyValueDAO.java
│  │  │              │      ReviewDAO.java
│  │  │              │      UserDAO.java
│  │  │              │      
│  │  │              ├─es
│  │  │              │      ProductESDAO.java
│  │  │              │      
│  │  │              ├─exception
│  │  │              │      GloabalExceptionHandler.java
│  │  │              │      
│  │  │              ├─interceptor
│  │  │              │      LoginInterceptor.java
│  │  │              │      OtherInterceptor.java
│  │  │              │      
│  │  │              ├─pojo
│  │  │              │      Category.java
│  │  │              │      Order.java
│  │  │              │      OrderItem.java
│  │  │              │      Product.java
│  │  │              │      ProductImage.java
│  │  │              │      Property.java
│  │  │              │      PropertyValue.java
│  │  │              │      Review.java
│  │  │              │      User.java
│  │  │              │      
│  │  │              ├─realm
│  │  │              │      JPARealm.java
│  │  │              │      
│  │  │              ├─service
│  │  │              │      CategoryService.java
│  │  │              │      OrderItemService.java
│  │  │              │      OrderService.java
│  │  │              │      ProductImageService.java
│  │  │              │      ProductService.java
│  │  │              │      PropertyService.java
│  │  │              │      PropertyValueService.java
│  │  │              │      ReviewService.java
│  │  │              │      UserService.java
│  │  │              │      
│  │  │              ├─test
│  │  │              │      TestTmall.java
│  │  │              │      
│  │  │              ├─util
│  │  │              │      ImageUtil.java
│  │  │              │      Page4Navigator.java
│  │  │              │      PortUtil.java
│  │  │              │      Result.java
│  │  │              │      SpringContextUtil.java
│  │  │              │      
│  │  │              └─web
│  │  │                      AdminPageController.java
│  │  │                      CategoryController.java
│  │  │                      ForePageController.java
│  │  │                      ForeRESTController.java
│  │  │                      OrderController.java
│  │  │                      ProductController.java
│  │  │                      ProductImageController.java
│  │  │                      PropertyController.java
│  │  │                      PropertyValueController.java
│  │  │                      UserController.java
│  │  │                      
│  │  ├─resources
│  │  │  │  application.properties
│  │  │  │  
│  │  │  ├─static
│  │  │  └─templates
│  │  │      ├─admin
│  │  │      │      editCategory.html
│  │  │      │      editProduct.html
│  │  │      │      editProperty.html
│  │  │      │      editPropertyValue.html
│  │  │      │      listCategory.html
│  │  │      │      listOrder.html
│  │  │      │      listProduct.html
│  │  │      │      listProductImage.html
│  │  │      │      listProperty.html
│  │  │      │      listUser.html
│  │  │      │      
│  │  │      ├─fore
│  │  │      │      alipay.html
│  │  │      │      bought.html
│  │  │      │      buy.html
│  │  │      │      cart.html
│  │  │      │      category.html
│  │  │      │      confirmPay.html
│  │  │      │      home.html
│  │  │      │      login.html
│  │  │      │      orderConfirmed.html
│  │  │      │      payed.html
│  │  │      │      product.html
│  │  │      │      register.html
│  │  │      │      registerSuccess.html
│  │  │      │      review.html
│  │  │      │      search.html
│  │  │      │      
│  │  │      └─include
│  │  │          ├─admin
│  │  │          │      adminFooter.html
│  │  │          │      adminHeader.html
│  │  │          │      adminNavigator.html
│  │  │          │      adminPage.html
│  │  │          │      
│  │  │          └─fore
│  │  │              │  footer.html
│  │  │              │  header.html
│  │  │              │  loginPage.html
│  │  │              │  modal4deleteConfirm.html
│  │  │              │  modal4login.html
│  │  │              │  productsBySearch.html
│  │  │              │  registerPage.html
│  │  │              │  registerSuccessPage.html
│  │  │              │  search.html
│  │  │              │  searchPage.html
│  │  │              │  simpleSearch.html
│  │  │              │  top.html
│  │  │              │  
│  │  │              ├─cart
│  │  │              │      alipayPage.html
│  │  │              │      boughtPage.html
│  │  │              │      buyPage.html
│  │  │              │      cartPage.html
│  │  │              │      confirmPayPage.html
│  │  │              │      orderConfirmedPage.html
│  │  │              │      payedPage.html
│  │  │              │      reviewPage.html
│  │  │              │      
│  │  │              ├─category
│  │  │              │      categoryPage.html
│  │  │              │      productsByCategory.html
│  │  │              │      sortBar.html
│  │  │              │      
│  │  │              ├─home
│  │  │              │      carousel.html
│  │  │              │      categoryAndcarousel.html
│  │  │              │      categoryMenu.html
│  │  │              │      homePage.html
│  │  │              │      homepageCategoryProducts.html
│  │  │              │      productsAsideCategorys.html
│  │  │              │      
│  │  │              └─product
│  │  │                      imgAndInfo.html
│  │  │                      productDetail.html
│  │  │                      productPage.html
│  │  │                      productReview.html
│  │  │                      
│  │  └─webapp
│  │      ├─css
│  │      │  ├─back
│  │      │  │      style.css
│  │      │  │      
│  │      │  ├─bootstrap
│  │      │  │  ├─3.3.6
│  │      │  │  │      bootstrap-theme.css
│  │      │  │  │      bootstrap-theme.css.map
│  │      │  │  │      bootstrap-theme.min.css
│  │      │  │  │      bootstrap-theme.min.css.map
│  │      │  │  │      bootstrap.css
│  │      │  │  │      bootstrap.css.map
│  │      │  │  │      bootstrap.min.css
│  │      │  │  │      bootstrap.min.css.map
│  │      │  │  │      
│  │      │  │  └─fonts
│  │      │  │          glyphicons-halflings-regular.eot
│  │      │  │          glyphicons-halflings-regular.svg
│  │      │  │          glyphicons-halflings-regular.ttf
│  │      │  │          glyphicons-halflings-regular.woff
│  │      │  │          glyphicons-halflings-regular.woff2
│  │      │  │          
│  │      │  └─fore
│  │      │          style.css
```



# 需求实现

## **分类管理（后台）**

思路：

1、构建控制层，增加方法list，add，delete，get，update，saveOrUpdateImageFile。

2、构建服务层，通过categoryDAO实现方法list，add，delete，get，update

3、创建接口CategoryDAO，并继承CategoryDAO 

4、创建实体Category.java

5、后台管理页面跳转专用控制器AdminPageController

6、新建CORSConfiguration，对于跨域请求问题，允许所有访问都跨域

7、新建GloabalExceptionHandler。异常处理，主要是在处理删除父类信息的时候，因为外键约束的存在，而导致违反约束。

8、新建application.properties



1、在tmall/web包下新建控制器CategoryController.java（专门用来提供 RESTFUL 服务器控制器），并创建list(),add(),delete(),get(),update(),saveOrUpdateImageFile()

```
package com.jack.tmall.web;

import com.jack.tmall.pojo.Category;
import com.jack.tmall.service.CategoryService;
import com.jack.tmall.util.ImageUtil;
import com.jack.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    /**
     *
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @GetMapping("/categories")
    public Page4Navigator<Category> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start=start<0?0:start;
        Page4Navigator<Category> page = categoryService.list(start, size, 5);
        return page;
    }

    @PostMapping("/categories")
    public Object add(Category bean, MultipartFile image, HttpServletRequest request) throws Exception{
        categoryService.add(bean);
        saveOrUpdateImageFile(bean,image,request);
        return bean;
    }

    @DeleteMapping("/categories/{id}")
    public String delete(@PathVariable("id") int id,HttpServletRequest request){
        categoryService.delete(id);
        File imageFolder = new File(request.getServletContext().getRealPath("/img/category"));
        File file = new File(imageFolder,id+".jpg");
        file.delete();
        return null;
    }

    @GetMapping("/categories/{id}")
    public Category get(@PathVariable("id") int id) throws Exception {
        Category bean=categoryService.get(id);
        return bean;
    }

    @PutMapping("/categories/{id}")
    public Object update(Category bean,MultipartFile image,HttpServletRequest request) throws Exception{
        String name = request.getParameter("name");
        bean.setName(name);
        categoryService.update(bean);
        if (image!=null){
            saveOrUpdateImageFile(bean,image,request);
        }
        return bean;
    }

    public void saveOrUpdateImageFile(Category bean, MultipartFile image, HttpServletRequest request)
            throws IOException {
        File imageFolder= new File(request.getServletContext().getRealPath("img/category"));
        File file = new File(imageFolder,bean.getId()+".jpg");
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        image.transferTo(file);
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, "jpg", file);
    }



}
```

2、在tmall/service包下创建服务层CategoryService.java，并创建方法list()，list(int start,int size, int navigatePages)，add(Category bean)，delete(int id)，get(int id)，update(Category bean)

```
package com.jack.tmall.service;

import com.jack.tmall.dao.CategoryDAO;
import com.jack.tmall.pojo.Category;
import com.jack.tmall.pojo.Product;
import com.jack.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return categoryDAO.findAll(sort);
    }

    public Page4Navigator<Category> list(int start,int size, int navigatePages){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page pageFromJPA = categoryDAO.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

    public void add(Category bean){
        categoryDAO.save(bean);
    }

    public void delete(int id){
        categoryDAO.delete(id);
    }

    public Category get(int id) {
        Category c= categoryDAO.findOne(id);
        return c;
    }

    public void update(Category bean){
        categoryDAO.save(bean);
    }

    public void removeCategoryFromProduct(List<Category> cs){
        for (Category category:cs)
            removeCategoryFromProduct(category);
    }

    public void removeCategoryFromProduct(Category category){
        List<Product> products = category.getProducts();
        if (null!=products){
            for (Product product:products)
                product.setCategory(null);
        }

        List<List<Product>> productsByRow = category.getProductsByRow();
        if (null!=productsByRow){
            for (List<Product> ps:productsByRow){
                for (Product product:ps)
                    product.setCategory(null);
            }
        }


    }
}
```

3、创建接口CategoryDAO，并继承CategoryDAO 

```
package com.jack.tmall.dao;

import com.jack.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
```

4、在tmall/pojo包下创建实体Category.java

```
package com.jack.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Category {

    // @Id表示该字段为一个自增长的Id,注意,是数据库表中自增!!
    //GenerationType.IDENTITY表示自增长方式使用mysql自带的
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String name;

    @Transient
    List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<List<Product>> getProductsByRow() {
        return productsByRow;
    }

    public void setProductsByRow(List<List<Product>> productsByRow) {
        this.productsByRow = productsByRow;
    }

    @Transient
    List<List<Product>> productsByRow;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

5、后台管理页面跳转专用控制器AdminPageController

```
package com.jack.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {

    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }

    @GetMapping(value="/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }

    @GetMapping(value="/admin_category_edit")
    public String editCategory(){
        return "admin/editCategory";

    }

    @GetMapping(value="/admin_order_list")
    public String listOrder(){
        return "admin/listOrder";

    }

    @GetMapping(value="/admin_product_list")
    public String listProduct(){
        return "admin/listProduct";

    }

    @GetMapping(value="/admin_product_edit")
    public String editProduct(){
        return "admin/editProduct";

    }
    @GetMapping(value="/admin_productImage_list")
    public String listProductImage(){
        return "admin/listProductImage";

    }

    @GetMapping(value="/admin_property_list")
    public String listProperty(){
        return "admin/listProperty";

    }

    @GetMapping(value="/admin_property_edit")
    public String editProperty(){
        return "admin/editProperty";

    }

    @GetMapping(value="/admin_propertyValue_edit")
    public String editPropertyValue(){
        return "admin/editPropertyValue";

    }

    @GetMapping(value="/admin_user_list")
    public String listUser(){
        return "admin/listUser";

    }
}
```

6、在tmall/config包下新建CORSConfiguration，继承WebMvcConfigurerAdapter。因为是二次请求，第一次是获取 html 页面， 第二次通过 html 页面上的 js 代码异步获取数据，一旦部署到服务器就容易面临跨域请求问题，所以允许所有访问都跨域，就不会出现通过 ajax 获取数据获取不到的问题了。

```
package com.jack.tmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*");
    }
}
```

7.在tmall/exception包下新建GloabalExceptionHandler。异常处理，主要是在处理删除父类信息的时候，因为外键约束的存在，而导致违反约束。

```
package com.jack.tmall.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestController
@RestControllerAdvice
public class GloabalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req,Exception e) throws ClassNotFoundException {
        e.printStackTrace();
        Class constraintViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if (null==e.getCause() && constraintViolationException==e.getCause().getClass()){
            return "违反了约束，多半是外键约束";
        }
        return e.getMessage();
    }

}
```

8、在resources包下新建application.properties

```
spring.datasource.password=admin
spring.datasource.username=root
spring.datasource.url=jdbc:mysql://localhost:3306/tmall_springboot?characterEncoding=UTF-8
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.hibernate.ddl-auto=none

spring.thymeleaf.encoding=UTF-8
spring.thymeleaf.content-type=text/html
spring.thymeleaf.cache=false
spring.thymeleaf.mode=LEGACYHTML5

server.context-path=/springboot_tmall

spring.http.multipart.max-request-size=100Mb
spring.http.multipart.max-file-size=100Mb

spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl


spring.jpa.show-sql=true
```

## **分类管理（前台）**

思路：

1、构建vue的data对象data4Vue

2、构建vue对象，绑定el，data，method，mounted

3、在mounted中增加方法list，add，deleteBean，getFile，jump，jumpByNumber，并异步调用，将返回值绑定到定义的data中。然后页面根据data数据展示



1、在resources/templates/admin包下新建listCategory.html和editCategory.html

listCategory.html

```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

    <head th:include="include/admin/adminHeader::html('分类管理')"></head>

<body>
    <div th:replace="include/admin/adminNavigator::html"></div>
    <script>
        $(function () {
            var data4Vue={
                uri:'categories',
                beans:[],
                pagination:{},
                bean:{id:0,name:''},
                file:null
            };
            var vue = new Vue({
                el:'#workingArea',
                data:data4Vue,
                mounted:function () {
                    this.list(0);
                },
                methods:{
                    list:function (start) {
                        var url = this.uri+"?start="+start;
                        axios.get(url).then(function (response) {
                            vue.pagination=response.data;
                            vue.beans=response.data.content;
                        });
                    },
                    add:function(){
                        if (!checkEmpty(this.bean.name, "分类名称")) 
                            return;
                        if (!checkEmpty(this.file,"分类图片"))
                            return;
                        var url=this.uri;
                        var formData = new FormData();
                        formData.append("image",this.file);
                        formData.append("name",this.bean.name);
                        axios.post(url,formData).then(function (response) {
                            vue.list(0);
                            vue.bean={id:0,name:''}
                            $("#categoryPic").val('');
                            vue.file=null;
                        });
                    },
                    deleteBean:function(id){
                        if (!checkDeleteLink())
                            return;
                        var url = this.uri+"/"+id;
                        axios.delete(url).then(function (response) {
                            if (0 != response.data.length){
                                alert(response.data);
                            }
                            else
                                vue.list(0);
                        })
                    },
                    getFile:function(event){
                        this.file=event.target.files[0];
                    },
                    jump: function(page){
                        jump(page,vue); //定义在adminHeader.html 中
                    },
                    jumpByNumber: function(start){
                        jumpByNumber(start,vue);
                    }
                }
            });
        });
    </script>

    <div id="workingArea">
        <h1 class="label label-info">分类管理</h1>
        <br>
        <br>
        <div class="listDataTableDiv">
            <table class="table table-striped table-bordered table-hover  table-condensed">
                <thead>
                    <tr class="success">
                        <th>ID</th>
                        <th>图片</th>
                        <th>分类名称</th>
                        <th>属性管理</th>
                        <th>产品管理</th>
                        <th>编辑</th>
                        <th>删除</th>
                    </tr>
                </thead>

                <tbody>
                    <tr v-for="bean in beans ">
                    <td>{{bean.id}}</td>
                    <td>
                        <img height="40px" :src="'img/category/'+bean.id+'.jpg'">
                    </td>
                    <td>{{bean.name}}</td>
                    <td>
                        <a :href="'admin_property_list?cid=' + bean.id "><span class="glyphicon glyphicon-th-list"></span></a>
                    </td>
                    <td>
                        <a :href="'admin_product_list?cid=' + bean.id "><span class="glyphicon glyphicon-shopping-cart"></span></a>
                    </td>
                    <td>
                        <a :href="'admin_category_edit?id=' + bean.id "><span class="glyphicon glyphicon-edit"></span></a>
                    </td>
                    <td>
                        <a href="#nowhere"  @click="deleteBean(bean.id)"><span class="   glyphicon glyphicon-trash"></span></a>
                    </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div th:replace="include/admin/adminPage::html"></div>
        <div class="panel panel-warning addDiv">
            <div class="panel-heading">新增分类</div>
            <div class="panel-body">
                <table class="addTable">
                    <tr>
                        <td>分类名称</td>
                        <td><input v-model.trim="bean.name" @keyup.enter="add" class="form-control" type="text"></td>
                    </tr>
                    <tr>
                        <td>分类图片</td>
                        <td><input id="categoryPic" accept="image/*" type="file" name="image" @change="getFile($event)"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <a href="#nowhere" @click="add" class="btn btn-success">提交</a>
                        </td>
                    </tr>
                </table>
            </div>

        </div>

    </div>
    <div th:replace="include/admin/adminFooter::html"></div>


</body>

</html>
```

editCategory.html

```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head th:include="include/admin/adminHeader::html('编辑分类')" ></head>

<body>
<div th:replace="include/admin/adminNavigator::html" ></div>
<script>
    $(function () {
        var data4Vue = {
            uri: 'categories',
            listURL:'admin_category_list',
            bean: { id: 0, name: ''},
            file:''
        };
        var vue = new Vue({
            el:"#workingArea",
            data:data4Vue,
            mounted:function () {
                this.get();
            },
            methods:{
                get:function(){
                    var id = getUrlParms("id");
                    var url = this.uri+"/"+id;
                    axios.get(url).then(function(response) {
                        vue.bean = response.data;
                    })
                },
                update:function () {
                    if(!checkEmpty(this.bean.name, "分类名称"))
                        return;
                    var url = this.uri+"/"+this.bean.id;

                    //axios.js 上传文件要用 formData 这种方式
                    var formData = new FormData();
                    formData.append("image", this.file);
                    formData.append("name", this.bean.name);
                    axios.put(url,formData).then(function(response){
                        location.href=vue.listURL;
                    });
                },
                getFile: function (event) {
                    this.file = event.target.files[0];
                }
            },
        });
    })

</script>
<div id="workingArea">
    <ol class="breadcrumb">
        <li><a href="/admin_category_list">所有分类</a></li>
        <li class="active">编辑分类</li>
    </ol>

    <div class="panel panel-warning editDiv">
        <div class="panel-heading">编辑分类</div>
        <div class="panel-body">
            <table class="editTable">
                <tr>
                    <td>分类名称</td>
                    <td><input  @keyup.enter="update" v-model.trim="bean.name" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>分类图片</td>
                    <td>
                        <input id="categoryPic" accept="image/*" type="file" name="image" @change="getFile($event)" />
                    </td>
                </tr>
                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <input type="hidden" name="id"   v-model.trim="bean.id" >
                        <a href="#nowhere" class="btn btn-success" @click="update">提 交</a>
                    </td>
                </tr>
            </table>
        </div>
    </div>

</div>

</body>
</html>
```

2.在resources/templates/include/admin包下新建adminFooter.html，adminHeader.html，adminNavigator.html，adminPage.html。

在webapp包下新建css，img，js（注： 静态资源为什么不放在 static 目录下？ 一般说来，在约定里，springboot 的静态资源会在 static 目录下，但是我们是放在 webapp 目录下，为什么会这样呢？ 因为我们还要做上传图片的功能，如果是放在 static 下，上传后的图片就无法被访问，还是放在 webapp 下，上传后，能够立即被访问。）

![1565576189247](C:\Users\Jack Ren\AppData\Roaming\Typora\typora-user-images\1565576189247.png)

adminFooter.html

```
<div th:fragment="html">
   <!-- 模仿天猫整站 springboot 为Jack版权所有-->
   <!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
   <!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->
</div>
```

adminHeader.html

```
<template th:fragment="html(title)" >
   <script src="js/jquery/2.0.0/jquery.min.js"></script>
   <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
   <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
   <script src="js/vue/2.5.16/vue.min.js"></script>
   <script src="js/axios/0.17.1/axios.min.js"></script>
   <script src="js/moment/2.22.2/moment.js"></script> <!-- vue.js 格式化日期用的 -->
   <link href="css/back/style.css" rel="stylesheet">
   
   <script>
   //判断是否为空
   function checkEmpty(value,text){
      
      if(null==value || value.length==0){
         alert(text+ "不能为空");
         return false;
      }
      return true;
   }  
   
    //获取地址栏参数的函数
    function getUrlParms(para){
       var search=location.search; //页面URL的查询部分字符串
       var arrPara=new Array(); //参数数组。数组单项为包含参数名和参数值的字符串，如“para=value”
       var arrVal=new Array(); //参数值数组。用于存储查找到的参数值
    
       if(search!=""){    
           var index=0;
           search=search.substr(1); //去除开头的“?”
           arrPara=search.split("&");
    
           for(i in arrPara){
               var paraPre=para+"="; //参数前缀。即参数名+“=”，如“para=”
               if(arrPara[i].indexOf(paraPre)==0&& paraPre.length<arrPara[i].length){
                   arrVal[index]=decodeURI(arrPara[i].substr(paraPre.length)); //顺带URI解码避免出现乱码
                   index++;
               }
           }
       }
    
       if(arrVal.length==1){
           return arrVal[0];
       }else if(arrVal.length==0){
           return null;
       }else{
           return arrVal;
       }
    }  
    
    //判断是否数字 (小数和整数)
   function checkNumber(value, text){
      
      if(value.length==0){
         alert(text+ "不能为空");
         return false;
      }
      if(isNaN(value)){
         alert(text+ "必须是数字");
         return false;
      }
      return true;
   }
    //判断是否整数
   function checkInt(value, text){
      
      if(value.length==0){
         alert(text+ "不能为空");
         return false;
      }
      if(parseInt(value)!=value){
         alert(text+ "必须是整数");
         return false;
      }
      return true;
   }
   
    //确实是否要删除
   function checkDeleteLink(){
      var confirmDelete = confirm("确认要删除");
      if(confirmDelete)
         return true;
      return false;     
   }
    //跳转函数
    function jump(page,vue){
      if('first'== page && !vue.pagination.first)
         vue.list(0);
      
      else if('pre'== page &&    vue.pagination.hasPrevious )
         vue.list(vue.pagination.number-1);
      
      else if('next'== page && vue.pagination.hasNext)
         vue.list(vue.pagination.number+1);             
      
      else if('last'== page && !vue.pagination.last)
         vue.list(vue.pagination.totalPages-1);     
    }
    //跳转函数
    function jumpByNumber(start,vue){
       if(start!=vue.pagination.number)
         vue.list(start);           
    }
   </script>  
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8">    
   <title th:text="${title}" ></title>
</template>
```

adminNavigator.html

```
<div class="navitagorDiv" th:fragment="html">
   <nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
      <img style="margin-left:10px;margin-right:0px" class="pull-left" src="img/site/tmallbuy.png" height="45px">
      <a class="navbar-brand" href="#nowhere">天猫后台</a>
      
      <a class="navbar-brand" href="admin_category_list">分类管理</a>
      <a class="navbar-brand" href="admin_user_list">用户管理</a>
      <a class="navbar-brand" href="admin_order_list">订单管理</a>
   </nav>
</div>
```

adminPage.html

```
<div class="pageDiv" th:fragment="html">
   <nav>
     <ul class="pagination">
       <li :class="{ disabled: pagination.first }">
         <a  href="#nowhere" @click="jump('first')">«</a>
       </li>
       <li :class="{ disabled: !pagination.hasPrevious }">
         <a  href="#nowhere" @click="jump('pre')">‹</a>
       </li>         

      <li  v-for="i in pagination.navigatepageNums">
         <a href="#nowhere" @click="jumpByNumber(i-1)" >
            {{i}}
         </a>
      </li>

       <li :class="{ disabled: !pagination.hasNext }">
         <a  href="#nowhere" @click="jump('next')">›</a>
       </li>
       <li :class="{ disabled: pagination.last }">
         <a  href="#nowhere" @click="jump('last')">»</a>
       </li>         
     </ul>
   </nav>    
</div>
```

## 其他实现项目功能见代码所示