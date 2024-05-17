<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../menu/menu.jsp" %>

<h2>成績参照</h2>
<table style="border-collapse: separated;border-spacing:10px;">
<div>科目情報
<th>入学年度</th>
<SELECT name="entYear">
 <option value="empty" selected>-----</option>
 <option value="2021" selected>2021</option>
 <option value="2022" selected>2022</option>
 <option value="2023" selected>2023</option>
 <option value="2024" selected>2024</option>
 <option value="2025" selected>2025</option>
</SELECT>
<th>クラス</th>
<SELECT name="classNum">
 <option value="empty" selected>------</option>
 <option value="201" selected>201</option>
 <option value="131" selected>131</option>
 <option value="101" selected>101</option>
</SELECT>
<th>科目</th>
<SELECT name="subject">
 <option value="empty" selected>-----</option>
 <option value="B02" selected>数学</option>
 <option value="A02" selected>国語</option>
 <option value="D02" selected>理科</option>
 <option value="E02" selected>情報処理基礎知識I</option>
 <option value="C02" selected>英語コミュニケーション概論</option>
 <option value="F02" selected>Javaフレームワーク</option>
 <option value="G02" selected>Git</option>
 <option value="H02" selected>H2</option>
 <option value="I02" selected>ID管理術</option>
 <option value="j02" selected>Javaシステム開発</option>
 <option value="A01" selected>AWS</option>
 <option value="B01" selected>Bean</option>
 <option value="C01" selected>C言語</option>
 <option value="D01" selected>DB</option>
 <option value="E01" selected>エラー対処術</option>
 <option value="F01" selected>Flutter</option>
 <option value="G01" selected>Go言語</option>
 <option value="H01" selected>ハードウェア</option>
 <option value="I01" selected>IT概論</option>
 <option value="J01" selected>Java基礎</option>
 <option value="1" selected>科目1</option>
 <option value="2" selected>科目2</option>
 <option value="3" selected>科目3</option>
 <option value="4" selected>科目4</option>
 <option value="5" selected>科目5</option>
</SELECT>
<button type="button" onclick="location.href=''">検査</button>
<input type="hidden" 
</div>

<p>学生情報
<div>学生番号
<label for="number">学生番号を入力してください</label>
<input type="text" number="number">
<button type="button" onclick="location.href='../score/Scoreserch.jsp'">検査</button>
<input type="hidden" number="numberid" value="number">
</div>
</p>
<p>科目情報を選択または学生情報を入力して検索ボタンをクリックしてください</p>

