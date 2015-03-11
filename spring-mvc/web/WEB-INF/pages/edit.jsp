<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Spring MVC</title>
        <link rel="stylesheet" href="<c:url value="/assets/css/foundation.css"/>" />
        <script src="<c:url value="/assets/js/vendor/modernizr.js"/>"></script>

    </head>
    <body>
        <div class="contain-to-grid sticky">
            <nav class="top-bar" data-topbar role="navigation">
                <ul class="title-area">
                    <li class="name"><h1>
                            <a href="<c:url value="/home"/>">Depan</a>
                        </h1></li>
                    <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
                </ul>
                <section class="top-bar-section">
                    <ul class="right">
                        <li class="has-dropdown"><a href="<c:url value="#"/>">Product</a>
                            <ul class="dropdown">
                                <li><a href="<c:url value="/home/daftar"/>">Daftar Product</a></li>
                                <li><a href="<c:url value="/home/insert"/>">Input Product</a></li>
                            </ul>
                        </li>                          
                    </ul>
                </section>
            </nav>
        </div>
        <div class="row">
            <div class="large-6 column">
                <h4>Insert Product</h4>
                <form action="<c:url value="/home/update"/>" method="post">
                    <p>Kode : <input type="text" name="kode" value="${product.kode}"/></p>
                    <p>Nama : <input type="text" name="nama" value="${product.nama}"/></p>
                    <p>Harga : <input type="text" name="harga" value="${product.harga}"/></p>
                    <p>Keterangan : <input type="text" name="keterangan" value="${product.keterangan}"/></p> 
                    <input type="hidden" name="id" value="${product.id}"/>
                    <p><input type="submit" value="Update" class="button tiny"/></p>
                </form>
            </div>
        </div>

        <script src="<c:url value="/assets/js/vendor/jquery.js"/>"></script>
        <script src="<c:url value="/assets/js/foundation.min.js"/>"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>