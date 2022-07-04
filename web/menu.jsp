<%--
  Created by IntelliJ IDEA.
  User: hyz
  Date: 2022/4/17
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--管理员菜单--%>
<c:if test="${nowAdmin!=null}">
    <!-- begin::side menu -->
    <div class="side-menu">
        <div class='side-menu-body'>
            <ul>
                <li class="side-menu-divider">Navigation</li>
                <li class="open">
                    <a href="#"><i class="icon ti-home"></i> <span>用户模块</span> </a>
                    <ul>
                        <li><a href="queryUser">用户列表</a></li>
                        <li><a href="UserInsert.jsp">添加用户</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-rocket"></i> <span>银行模块</span> </a>
                    <ul>
                        <li><a href="/queryBank">银行列表</a></li>
                        <li><a href="BankInsert.jsp">添加银行</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-layers-alt"></i> <span>银行卡模块</span> </a>
                    <ul>
                        <li><a href="/queryBankCard">银行卡列表</a></li>
                        <li><a href="toInsertBankCard">添加银行卡</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-layers-alt"></i> <span>基金理财产品模块</span> </a>
                    <ul>
                        <li><a href="/queryFundProduct">基金理财产品列表</a></li>
                        <li><a href="FundProductInsert.jsp">添加基金理财产品</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-layers-alt"></i> <span>用户投资基金模块</span> </a>
                    <ul>
                        <li><a href="/queryUserFundProduct">用户投资基金列表</a></li>
                        <li><a href="toInsertUserFundProduct">添加用户投资基金</a></li>
                    </ul>
                </li>
                    <%--            <li><a href="#"><i class="icon ti-paint-roller"></i> <span>Advanced UI</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="sweet-alert.html">Sweet Alert </a></li>--%>
                    <%--                    <li><a href="lightbox.html">Light Box </a></li>--%>
                    <%--                    <li><a href="toast.html">Toast </a></li>--%>
                    <%--                    <li><a href="tour.html">Tour </a></li>--%>
                    <%--                    <li><a href="swiper.html">Swiper </a></li>--%>
                    <%--                    <li><a href="tree-view.html">Tree View </a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-clipboard"></i> <span>Forms</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="basic-form.html">Basic Form </a></li>--%>
                    <%--                    <li><a href="custom-form.html">Custom Form </a></li>--%>
                    <%--                    <li><a href="advanced-form.html">Advanced Form </a></li>--%>
                    <%--                    <li><a href="datepicker.html">Datepicker </a></li>--%>
                    <%--                    <li><a href="timepicker.html">Timepicker </a></li>--%>
                    <%--                    <li><a href="colorpicker.html">Colorpicker </a></li>--%>
                    <%--                    <li><a href="form-validation.html">Form Validation </a></li>--%>
                    <%--                    <li><a href="form-wizard.html">Form Wizard </a></li>--%>
                    <%--                    <li><a href="file-upload.html">File Upload </a></li>--%>
                    <%--                    <li><a href="#">CKEditor </a>--%>
                    <%--                        <ul>--%>
                    <%--                            <li><a href="ckeditor-article.html">Article Editor </a></li>--%>
                    <%--                            <li><a href="ckeditor-inline.html">Inline Editor </a></li>--%>
                    <%--                        </ul>--%>
                    <%--                    </li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="icons.html"><i class="icon ti-crown"></i> <span>Icons</span> </a></li>--%>
                    <%--            <li>--%>
                    <%--                <a href="#">--%>
                    <%--                    <i class="icon ti-map"></i>--%>
                    <%--                    <span>Maps</span>--%>
                    <%--                </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="google-map.html">Google</a></li>--%>
                    <%--                    <li><a href="vector-map.html">Vector</a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li>--%>
                    <%--                <a href="#">--%>
                    <%--                    <i class="icon ti-pie-chart"></i>--%>
                    <%--                    <span>Charts</span>--%>
                    <%--                </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="chart-chartjs.html">Chartjs</a></li>--%>
                    <%--                    <li><a href="chart-justgage.html">Justgage</a></li>--%>
                    <%--                    <li><a href="chart-peity.html">Peity</a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-face-smile"></i> <span>Authentication</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="login.html">Login </a></li>--%>
                    <%--                    <li><a href="register.html">Register </a></li>--%>
                    <%--                    <li><a href="recover-password.html">Recovery Password </a></li>--%>
                    <%--                    <li><a href="lock-screen.html">Lock Screen </a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-files"></i> <span>Pages</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="profile.html">Profile </a></li>--%>
                    <%--                    <li><a href="timeline.html">Timeline </a></li>--%>
                    <%--                    <li><a href="invoice.html">Invoice </a></li>--%>
                    <%--                    <li><a href="pricing-table.html">Pricing Table </a></li>--%>
                    <%--                    <li><a href="search-result.html">Search Result </a></li>--%>
                    <%--                    <li><a href="blank-page.html">Blank Page V1 </a></li>--%>
                    <%--                    <li><a href="blank-page-v2.html">Blank Page V2 </a></li>--%>
                    <%--                    <li><a href="#">Errors </a>--%>
                    <%--                        <ul>--%>
                    <%--                            <li><a href="404.html">404 </a></li>--%>
                    <%--                            <li><a href="404-alternative.html">404 Alternative </a></li>--%>
                    <%--                            <li><a href="mean-at-work.html">Mean at Work </a></li>--%>
                    <%--                        </ul>--%>
                    <%--                    </li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-menu"></i> <span>Menu Level</span></a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="#">Menu Level </a>--%>
                    <%--                        <ul>--%>
                    <%--                            <li><a href="#">Menu Level </a></li>--%>
                    <%--                        </ul>--%>
                    <%--                    </li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
            </ul>
        </div>
    </div>
    <!-- end::side menu -->
</c:if>

<%--用户菜单--%>
<c:if test="${nowUser!=null}">
    <!-- begin::side menu -->
    <div class="side-menu">
        <div class='side-menu-body'>
            <ul>
                <li class="side-menu-divider">Navigation</li>
                <li class="open">
                    <a href="#"><i class="icon ti-home"></i> <span>用户模块</span> </a>
                    <ul>
                        <li><a href="/toUpdateUser?id=${nowUser.id}">个人中心</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-rocket"></i> <span>银行模块</span> </a>
                    <ul>
                        <li><a href="queryBank">银行列表</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-layers-alt"></i> <span>银行卡模块</span> </a>
                    <ul>
                        <li><a href="queryBankCardUser?userId=${nowUser.id}">银行卡列表</a></li>
                        <li><a href="toInsertBankCardUser">添加银行卡</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-layers-alt"></i> <span>基金理财产品模块</span> </a>
                    <ul>
                        <li><a href="queryFundProductUser">基金理财产品列表</a></li>

                    </ul>
                </li>
                <li><a href="#"><i class="icon ti-layers-alt"></i> <span>用户投资基金模块</span> </a>
                    <ul>
                        <li><a href="queryUserFundProductUser?userId=${nowUser.id}">用户投资基金列表</a></li>

                    </ul>
                </li>
                    <%--            <li><a href="#"><i class="icon ti-paint-roller"></i> <span>Advanced UI</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="sweet-alert.html">Sweet Alert </a></li>--%>
                    <%--                    <li><a href="lightbox.html">Light Box </a></li>--%>
                    <%--                    <li><a href="toast.html">Toast </a></li>--%>
                    <%--                    <li><a href="tour.html">Tour </a></li>--%>
                    <%--                    <li><a href="swiper.html">Swiper </a></li>--%>
                    <%--                    <li><a href="tree-view.html">Tree View </a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-clipboard"></i> <span>Forms</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="basic-form.html">Basic Form </a></li>--%>
                    <%--                    <li><a href="custom-form.html">Custom Form </a></li>--%>
                    <%--                    <li><a href="advanced-form.html">Advanced Form </a></li>--%>
                    <%--                    <li><a href="datepicker.html">Datepicker </a></li>--%>
                    <%--                    <li><a href="timepicker.html">Timepicker </a></li>--%>
                    <%--                    <li><a href="colorpicker.html">Colorpicker </a></li>--%>
                    <%--                    <li><a href="form-validation.html">Form Validation </a></li>--%>
                    <%--                    <li><a href="form-wizard.html">Form Wizard </a></li>--%>
                    <%--                    <li><a href="file-upload.html">File Upload </a></li>--%>
                    <%--                    <li><a href="#">CKEditor </a>--%>
                    <%--                        <ul>--%>
                    <%--                            <li><a href="ckeditor-article.html">Article Editor </a></li>--%>
                    <%--                            <li><a href="ckeditor-inline.html">Inline Editor </a></li>--%>
                    <%--                        </ul>--%>
                    <%--                    </li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="icons.html"><i class="icon ti-crown"></i> <span>Icons</span> </a></li>--%>
                    <%--            <li>--%>
                    <%--                <a href="#">--%>
                    <%--                    <i class="icon ti-map"></i>--%>
                    <%--                    <span>Maps</span>--%>
                    <%--                </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="google-map.html">Google</a></li>--%>
                    <%--                    <li><a href="vector-map.html">Vector</a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li>--%>
                    <%--                <a href="#">--%>
                    <%--                    <i class="icon ti-pie-chart"></i>--%>
                    <%--                    <span>Charts</span>--%>
                    <%--                </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="chart-chartjs.html">Chartjs</a></li>--%>
                    <%--                    <li><a href="chart-justgage.html">Justgage</a></li>--%>
                    <%--                    <li><a href="chart-peity.html">Peity</a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-face-smile"></i> <span>Authentication</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="login.html">Login </a></li>--%>
                    <%--                    <li><a href="register.html">Register </a></li>--%>
                    <%--                    <li><a href="recover-password.html">Recovery Password </a></li>--%>
                    <%--                    <li><a href="lock-screen.html">Lock Screen </a></li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-files"></i> <span>Pages</span> </a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="profile.html">Profile </a></li>--%>
                    <%--                    <li><a href="timeline.html">Timeline </a></li>--%>
                    <%--                    <li><a href="invoice.html">Invoice </a></li>--%>
                    <%--                    <li><a href="pricing-table.html">Pricing Table </a></li>--%>
                    <%--                    <li><a href="search-result.html">Search Result </a></li>--%>
                    <%--                    <li><a href="blank-page.html">Blank Page V1 </a></li>--%>
                    <%--                    <li><a href="blank-page-v2.html">Blank Page V2 </a></li>--%>
                    <%--                    <li><a href="#">Errors </a>--%>
                    <%--                        <ul>--%>
                    <%--                            <li><a href="404.html">404 </a></li>--%>
                    <%--                            <li><a href="404-alternative.html">404 Alternative </a></li>--%>
                    <%--                            <li><a href="mean-at-work.html">Mean at Work </a></li>--%>
                    <%--                        </ul>--%>
                    <%--                    </li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
                    <%--            <li><a href="#"><i class="icon ti-menu"></i> <span>Menu Level</span></a>--%>
                    <%--                <ul>--%>
                    <%--                    <li><a href="#">Menu Level </a>--%>
                    <%--                        <ul>--%>
                    <%--                            <li><a href="#">Menu Level </a></li>--%>
                    <%--                        </ul>--%>
                    <%--                    </li>--%>
                    <%--                </ul>--%>
                    <%--            </li>--%>
            </ul>
        </div>
    </div>
    <!-- end::side menu -->
</c:if>

