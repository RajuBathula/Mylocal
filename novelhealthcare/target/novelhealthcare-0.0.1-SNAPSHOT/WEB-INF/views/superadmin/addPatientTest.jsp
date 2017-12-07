<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <head>
        <script>
(function (w, d, s, l, i) {
w[l] = w[l] || []; w[l].push({
'gtm.start':
new Date().getTime(), event: 'gtm.js'
}); var f = d.getElementsByTagName(s)[0],
j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src =
'https://www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-NQRQTLL');</script>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Hospital Management System</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

        <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic" rel="stylesheet" type="text/css" />

        <!-- Bootstrap 3.3.6 -->
        <link href="/Content/mainCSS?v=RHtXOXYKBQhYgH6CZLR8x3ehp_uauaIIKeT_ymKxuLg1" rel="stylesheet"/>

        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">

        <link href="/Content/themeCSS?v=e_x5cApqF0PfVRb343IVSAEjYcXSCcRBWdqQzZsw1rY1" rel="stylesheet"/>

        <link href="/plugins/uniform/css/uniformcss?v=rtpJHQFjIuCiDGElYr8p8fAuvHYC2OVkK1OD3FsT6Iw1" rel="stylesheet"/>


        
        <link href="/Content/datepickerCSS?v=eWc1Y7ln0c8OCwy-JjOoQAyAfpAsjqHWNmmdYLQQFbo1" rel="stylesheet"/>

        <link href="/Content/utilityCSS?v=kJPPl98Wwpwv7vtWnjm4pqBjrywCWCzhStYeUi-Di4M1" rel="stylesheet"/>


        <link href="/plugins/alerts/jAlertCSS?v=qr0G-p-GcDkl87E6g-12hAqjXChCyolt6g5cA1BSd741" rel="stylesheet"/>


        <script src="/bundles/jquery?v=GTahrV-DLbjx0rm16RvZccZL3JqoVCyJ41L8DZcoElI1"></script>

    
     

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
        <noscript>
    <iframe src="https://www.googletagmanager.com/ns.html?id=GTM-NQRQTLL"
            height="0" width="0" style="display:none;visibility:hidden"></iframe>
</noscript>

        <div class="wrapper">
            <header class="main-header">
    <!-- Logo -->
    <a href="/" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        
        <span class="logo-mini">H</span>
        <!-- logo for regular state and mobile devices -->
        
        <span class="logo-lg">HMS PRO</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="/UploadFiles/ProfilePic/Lab/1/20170330061255.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">Demo Laboratorist</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="/UploadFiles/ProfilePic/Lab/1/20170330061255.jpg" class="img-circle" alt="User Image">
                            <p>
                                Demo Laboratorist - Laboratorist
                            </p>
                        </li>
                        
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="/EditProfile" class="btn btn-default btn-flat">Profile</a>
                                
                            </div>
                            <div class="pull-right">
                                <a class="btn btn-default btn-flat" href="/Account/Logout">Sign out</a>
                            </div>
                        </li>
                    </ul>
                </li>
                <!-- Control Sidebar Toggle Button -->
                
            </ul>
        </div>
    </nav>
</header>




            <!-- Left side column. contains the logo and sidebar -->
            
<aside class="main-sidebar">
    <section class="sidebar">
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/UploadFiles/ProfilePic/Lab/1/20170330061255.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>Demo Laboratorist</p>
                <a>Laboratorist</a>
            </div>
        </div>
        <ul class="sidebar-menu">
                            <li id="dashboard">
                                <a href="/dashboard"><i class="fa fa-dashboard"></i><span>Dashboard</span></a>
                            </li>
                            <li id="" class="treeview">
                                <a href="#"><i class="fa fa-flask"></i><span>Lab Mgmt</span><span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span></a>
                                <ul class="treeview-menu">
                                        <li id="labtest">
                                            <a href="/labtest"><i class="fa fa-circle-o"></i>Lab Test</a>
                                        </li>
                                        <li id="labtestcategory">
                                            <a href="/labtestcategory"><i class="fa fa-circle-o"></i>Lab Test Categories</a>
                                        </li>
                                        <li id="patienttest">
                                            <a href="/patienttest"><i class="fa fa-circle-o"></i>Patient Test</a>
                                        </li>
                                </ul>
                            </li>
                            <li id="" class="treeview">
                                <a href="#"><i class="fa fa-tint"></i><span>Blood Bank</span><span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span></a>
                                <ul class="treeview-menu">
                                        <li id="privatebloodbank">
                                            <a href="/privatebloodbank"><i class="fa fa-circle-o"></i>Private Blood Bank</a>
                                        </li>
                                        <li id="publicbloodbank">
                                            <a href="/publicbloodbank"><i class="fa fa-circle-o"></i>Public Bood Bank</a>
                                        </li>
                                </ul>
                            </li>
                            <li id="editprofile">
                                <a href="/editprofile"><i class="fa fa-edit"></i><span>Edit Profile</span></a>
                            </li>
                            <li id="sitemap">
                                <a href="/"><i class="fa fa-home"></i><span>Sitemap</span></a>
                            </li>

        </ul>
    </section>
</aside>


<script type="text/javascript">

    function GetSelectedPageId() {
        var selectId = "sitemap";

        var pageName = window.location.pathname.substring(window.location.pathname.lastIndexOf("/") + 1);
        pageName = pageName.toLowerCase();

        selectId = pageName.replace(".aspx", "");

        if (selectId == "") selectId = "sitemap";

        return selectId;
    }

    function SetActiveMenu() {

        var selectId = GetSelectedPageId();
        //console.log("selectId in : " + selectId);
        var selectedItem = $(".sidebar-menu " + "#" + selectId);

        var parent = selectedItem.parents('ul').first();
        var parent_li = selectedItem.parent("li");

        selectedItem.slideDown(500, function () {
            //Add the class active to the parent li
            parent.addClass('menu-open');
            //parent.find('li.active').removeClass('active');
            selectedItem.addClass('active');
            selectedItem.parents('ul').first().parent().addClass('active');
        });
    }
</script>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper" id="divPageBody">
                
<section class="content-header">
    <h1>Patient Test</h1>
    <ol class="breadcrumb">
        <li><a href="/"><i class="fa fa-home"></i> Home</a></li>
        <li><a href="/PatientTest">Patient Tests</a></li>
        <li class="active">Add PatientTest</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-xs-12">
<form action="/patienttest/Add?Length=0" class="form-horizontal" data-ajax="true" data-ajax-begin="onBeginSubmit" data-ajax-method="POST" data-ajax-mode="replace" data-ajax-success="onSuccess" data-ajax-update="#divPageBody" id="form0" method="post"><input name="__RequestVerificationToken" type="hidden" value="TFBg0RD_xGK-owZh3p-waPfu_l-l2aLltn59oYZH-CUStBW8jdUGlYqHpoGmXOghJyjjf0DBQeSe2SUu_mwLrl1xnTfuM0uaWcHk_lf48Ew1" />                <div class="box">
                    <div class="box-header"><div class="message-box"></div></div>
                    <div class="box-body">

                        <div class="form-body" id="mainform">
                            <!-- BEGIN FORM-->
                            <div class="form-group">
                                <label class="col-md-2 control-label">
                                    <label for="PatientTest_PatientId">Patient</label>  <span class="required">*</span>
                                    <input data-val="true" data-val-number="The field PatientTestId must be a number." data-val-required="The PatientTestId field is required." id="PatientTest_PatientTestId" name="PatientTest.PatientTestId" type="hidden" value="0" />
                                </label>

                                <div class="col-md-4">
                                    <div class="input-icon right">
                                        <select class="form-control" data-val="true" data-val-number="The field Patient must be a number." data-val-required="The Patient field is required." id="PatientTest_PatientId" name="PatientTest.PatientId" style=""><option value="">-- Select Patient --</option>
<option value="87">aftab j</option>
<option value="88">Bablu Kumawat</option>
<option value="85">bukan labo</option>
<option value="51">DASD DAD sadsd</option>
<option value="79">Deneme Sonna</option>
<option value="62">fname lname</option>
<option value="42">Gary Yori</option>
<option value="64">H&#224; TX H&#224;</option>
<option value="80">Hermenegildo Gunza</option>
<option value="44">Hoa Sarao</option>
<option value="77">H&#252;seyin  Simsek</option>
<option value="66">Imrtiyaz Jamadar</option>
<option value="78">ioSol Solutions</option>
<option value="68">ismail sagor</option>
<option value="58">Kingsley Mac</option>
<option value="65">MAJOR TRESOR</option>
<option value="95">Maulik Shah</option>
<option value="40">Ricky Nayar</option>
<option value="98">samuel kobomoje</option>
<option value="73">Sharooq S</option>
<option value="53">Suresh aru</option>
<option value="75">tarun vashisht</option>
<option value="54">test test</option>
<option value="97">test cfg</option>
<option value="94">Test thi</option>
</select>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <span class="field-validation-valid" data-valmsg-for="PatientTest.PatientId" data-valmsg-replace="true"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">
                                    <label for="PatientTest_ConsultantId">Consultant</label>  <span class="required">*</span>
                                </label>

                                <div class="col-md-4">
                                    <div class="input-icon right">
                                        <select class="form-control" data-val="true" data-val-number="The field Consultant must be a number." data-val-required="The Consultant field is required." id="PatientTest_ConsultantId" name="PatientTest.ConsultantId" style=""><option value="">-- Select Consultant --</option>
<option value="81">Ernestro Castro</option>
<option value="9">Glory Culzer</option>
<option value="55">xxx xxx</option>
<option value="24">Yuki Folsi</option>
</select>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <span class="field-validation-valid" data-valmsg-for="PatientTest.ConsultantId" data-valmsg-replace="true"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">
                                    <label for="PatientTest_TestDate">TestDate</label> <span class="required">*</span>
                                </label>

                                <div class="col-md-4">
                                    <div class="input-icon right">
                                        <input class="form-control" data-val="true" data-val-date="The field TestDate must be a date." id="PatientTest_TestDate" maxlength="50" name="PatientTest.TestDate" type="text" value="" />

                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <span class="field-validation-valid" data-valmsg-for="PatientTest.TestDate" data-valmsg-replace="true"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">
                                    <label for="PatientTest_DeliveryDate">DeliveryDate</label> <span class="required">*</span>
                                </label>

                                <div class="col-md-4">
                                    <div class="input-icon right">
                                        <input class="form-control" data-val="true" data-val-date="The field DeliveryDate must be a date." id="PatientTest_DeliveryDate" maxlength="50" name="PatientTest.DeliveryDate" type="text" value="" />

                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <span class="field-validation-valid" data-valmsg-for="PatientTest.DeliveryDate" data-valmsg-replace="true"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">
                                    <label for="PatientTest_ReportStatus">Payment Status</label> <span class="required">*</span>
                                </label>

                                <div class="col-md-4">
                                    <div class="input-icon right">
                                        <select class="form-control" data-val="true" data-val-number="The field Payment Status must be a number." data-val-required="The Payment Status field is required." id="PatientTest_ReportStatus" name="PatientTest.ReportStatus"><option selected="selected" value="0">Pending</option>
<option value="1">Delivered</option>
</select>

                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <span class="field-validation-valid" data-valmsg-for="PatientTest.ReportStatus" data-valmsg-replace="true"></span>
                                </div>
                            </div>

                            
                        </div>


                    </div>
                </div>
                <div class="box">
                    <div class="box-header">Test Detail</div>
                    <div class="box-body">
                        <div class="form-group test-header">

                            <label class="col-md-2 control-label"></label>
                            <label class="col-md-2">Test</label>
                            <label class="col-md-2">Result</label>
                            <label class="col-md-4">Remarks</label>
                            <label class="col-md-2">Delete</label>
                        </div>


                        <div id="testRows">
                        </div>

                        <div class="form-group">
                            <div class="col-md-2"></div>
                            <div class="col-md-4">
                                <a id="addItem" class="btn btn-primary btn-flat btn-sm" href="/PatientTest/BlankEditorRow"><i class="fa fa-plus"></i>&nbsp;&nbsp;Add Test</a>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="form-actions">
                    <div class="row text-center">
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-success btn-flat"><i class="fa fa-save"></i>&nbsp;&nbsp;Save</button>
                            <button type="reset" class="btn  btn-primary btn-flat" onclick="$(this).resetValidation()"><i class="fa fa-undo"></i>&nbsp;&nbsp;Reset</button>
                            <a class="btn btn-primary btn-flat" href="/PatientTest"><i class="fa fa-ban"></i>&nbsp;&nbsp;Cancel</a>
                        </div>
                    </div>
                </div>
</form>        </div>
    </div>
</section>

<script type="text/javascript">
    $(this.document).ready(function () {
        if ('' != null && '' != '') {
            notificationMessage('', 'danger')
            HRN.hideLoader();
        }

        jQuery('#PatientTest_TestDate').datepicker({
            showOn: 'button',
            format: 'dd-M-yyyy',
            maxDate: "+24M +10D",
            autoclose: true,
            todayHighlight: true,
            pickTime: false,
        });

        jQuery('#PatientTest_DeliveryDate').datepicker({
            showOn: 'button',
            format: 'dd-M-yyyy',
            maxDate: "+24M +10D",
            autoclose: true,
            todayHighlight: true,
            pickTime: false,
        });

        hideShowHeaderRow();

        $("#addItem").click(function () {
            $.ajax({
                url: this.href,
                cache: false,
                success: function (html) { $("#testRows").append(html); $(":checkbox").uniform({ resetSelector: true }); hideShowHeaderRow(); }
            });
            return false;
        });
        $("a.deleteRow").live("click", function () {
            $(this).parents("div.testRow:first").remove();
            hideShowHeaderRow();
            return false;
        });

    });

    function hideShowHeaderRow() {
        if ($(".testRow").length > 0) {
            $(".test-header").show();
        }
        else {
            $(".test-header").hide();
        }
    }

    var onBeginSubmit = function () {
        HRN.showLoader();
    };

    function onSuccess() {
        if ('' == null || '' == '') {
            HRN.hideLoader();
            window.location.href = '/patienttest?status=s';
        }
    }

</script>

            </div>
            <!-- /.content-wrapper -->
            
<footer class="main-footer">
    <div class="pull-right hidden-xs">
        <b>Demo data will be reset in 48 Hrs.</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>Version</b> 1.0.0
    </div>
    2017  &#169; HMS PRO [Developed By : NPDEV13]
</footer>

            

            <div class="loader" style="display: none;">
                <img src="/img/loader.png" alt="loader" class="loading-anim" />
            </div>

        </div>


        <script src="/bundles/jqueryPlugins?v=-5pElSUFfSGwaO8lFrNi-YY2bX2auYUsrximRiL-6SM1"></script>



        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>

        

        <script src="/bundles/datepickerJS?v=uUN-Rkfp0fhUfhX7lmM3-cWT5OKAvm6Up4jYnst_kJc1"></script>


        <script src="/bundles/jalert?v=VRoOs1tL3YXaWQ0af26Bvj9UkV62RA9Q5FZLS9vnDws1"></script>


        <script src="/bundles/utilityPluginJS?v=ac7I_UXM5tFRo9LpWF1T0Vow6k4CO8kY4c8DIyn452s1"></script>


        <script src="/bundles/appJS?v=CTSQ0PB-eTGJa-O2Erq7JabzmbECRGWJBGAcH-xOd841"></script>


        

        <script type="text/javascript">
            $(function () { SetActiveMenu(); });

            jQuery(document).ready(function () {
                pageLoad();
            });


            function pageLoad() {
                pageLoadEvents();
            }

            function pageLoadEvents() {

                $(":checkbox").uniform();

                alertTitle = jQuery('.page-alert-title').html();

                // listing page status(active/inactive) and delete button event
                $("#imgActive, #imgInactive, #imgDelete").click(function () {
                    if (!IsCheckBoxChecked()) {
                        if (this.name == "imgDelete") {
                            jAlert('Please select record(s) to delete!', alertTitle);
                        }
                        else {
                            jAlert('Please select record(s) to change status!', alertTitle);
                        }
                    }
                    else {
                        ActionClickEvent(this.id, this.name);
                    }
                });
            }

            // listing page status(active/inactive) and delete event
            function ActionClickEvent(clickId, clickName) {
                var confirmMsg = 'Are you sure you want to {0} record?'.replace("{0}", clickName.replace('img', '').toLowerCase());

                checkedValues = '';
                $('input[name="chkBox"]:checked').each(function () {
                    checkedValues += this.value + ",";
                });

                if (checkedValues.length > 0) {
                    checkedValues = checkedValues.substring(0, checkedValues.length - 1);

                    jConfirm(confirmMsg, alertTitle, function (r) {
                        if (r == true) {
                            multiProcessMode = clickName.replace('img', '');
                            var postData = { "page": pageNo, "pageSize": pageSize, "searchField": searchField, "searchValue": searchValue, "sortField": sortField, "sortOrder": sortOrder, "ids": checkedValues, "mode": multiProcessMode };

                            callPageAction(currentSiteUrl, postData, 'MultiProcess');
                        }

                        //UnCheck();
                    });
                }
            }

            function InitDatePicker(clickId, isCreate) {
                if (isCreate)
                    $("#" + clickId).datepicker();
                else
                    $("#" + clickId).datepicker('remove');
            }

            function callPageAction(url, postData, action) {
                //showLoading();
                HRN.showLoader();
                $.ajax({
                    url: url,
                    data: postData,
                    type: 'POST',
                    success: function (response) {
                        if (response.IsError) {
                            notificationMessage(response.ErrorMsg, 'danger')
                            HRN.hideLoader();
                            return;

                        }
                        else {
                            $('#divPageBody').html(response);
                        }

                        //$('#divPageBody').html(response);

                        if (action == 'MultiProcess') {
                            var arrcheckedCount = checkedValues.split(',');

                            if (multiProcessMode == 'Active') {
                                notificationMessage('{0} record(s) active successfully.'.replace('{0}', arrcheckedCount.length), 'success');
                            }
                            else if (multiProcessMode == 'Inactive') {
                                notificationMessage('{0} record(s) inactive successfully.'.replace('{0}', arrcheckedCount.length), 'success');
                            }
                            else {
                                notificationMessage('{0} record(s) deleted successfully.'.replace('{0}', arrcheckedCount.length), 'success');
                            }
                        }
                        else if (action == 'Sorting' || action == 'Searching') {
                            if (searchField != '' && searchValue != '') {
                                var msg = 'Your search for <b> {0} </b>has found<b> {1} </b>matches.';
                                msg = msg.replace('{1}', itemListCount);

                                if (searchField == 'IsActive' || searchField == 'Status') {
                                    msg = msg.replace('{0}', $("#ddlStatus option:selected").text());
                                }
                                else {
                                    msg = msg.replace('{0}', searchValue);
                                }

                                notificationMessage(msg, 'info')
                            }
                        }
                        else if (action == 'ViewAll') {
                            $('#ddlStatus').hide();
                            $('#txtSearchField').show();
                            $('#txtSearchField').val('');
                            $('#ddlStatus').val('1');
                            $("#ddlFilter")[0].selectedIndex = 0;
                        }

                        HRN.hideLoader();
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        HRN.hideLoader();
                        $('#divPageBody').html(jqXHR.responseText);
                    }
                });
            }

        </script>

</body>
</html>