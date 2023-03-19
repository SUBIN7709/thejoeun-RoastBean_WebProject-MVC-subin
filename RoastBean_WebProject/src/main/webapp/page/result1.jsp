<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko" dir="ltr">
  <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="author" content="PandaCoding">
      <meta name="keywords" content="나와 맞는 원두 찾기">
      <meta name="description" content="나와 맞는 원두 찾기">

      <!--favicon-->
      <link rel="shortcut icon" href="../img/favicon.png">
      <link rel="apple-touch-icon-precomposed" href="../img/favicon.png" />

      <title>나와 맞는 원두 찾기</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
      <link rel="preconnect" href="https://fonts.gstatic.com">
      <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
      <link rel="stylesheet" href="../css/default.css">
      <link rel="stylesheet" href="../css/result.css">
  </head>
  <body>
    <section id="shareResult" class="mx-auto my-5 py-5 px-3">
      <h1>당신의 결과는?!</h1>
      <div class="resultname">
        <p>에티오피아 코케 허니 예가체프 G1</p>
      </div>
      <div id="resultImg" class="my-3 col-lg-6 col-md-8 col-sm-10 col-12 mx-auto">
        <img src="../img/image1.png" alt="0" class="img-fluid">
      </div>
      <div class="resultDesc">
        <p>입안을 채우는 다채로운 향과 맛. 꿀처럼 달콤한 맛과 싱그러운 산미의 조화</p>
      </div>
      <script type="text/javascript">
        function moveHome(){
          location.href = "/RoastBean_WebProject/beans_that_fit_me.jsp";
        }
      </script>
      <button type="button" class="gohome mt-3 py-2 px-3" onclick="js:moveHome()">나도 참여하기</button>
    </section>
  </body>
</html>