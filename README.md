## 第２回講座課題

***

### プログラム概要

数値２を５回繰り返し計算をし結果を出力するプログラム。計算の種類を足し算にするか引き算にするかコンソールでユーザーに入力させる。

---

### mainメソッドの動作

- 上記概要の数値「２」と繰り返し回数「５」はmainメソッド先頭で宣言し、mainクラス下部Calcクラスのインスタンス化の際にコンストラクタに渡す。【コンストラクタ練習】


- mainメソッドを実行しコンソール入力待ち(Scanner)で1を入力すると足し算、2を入力すると引き算になる。
  それ以外の文字列が入力されたらプログラム終了。→入力された値はsetterでCalcクラスに渡す。【setter・if文練習】


- Calcクラスで計算処理した結果の文字列はmainクラスからgetterで受け取る。受け取った文字列（計算結果）をmainメソッドでコンソールに出力。【getter・for文練習】

***

### 結果画像

▼１を入力の結果（足し算）

![021plus](https://user-images.githubusercontent.com/101798620/168427684-164cdfa9-7575-4b32-8a14-497b1aabec98.png)
***
▼２を入力の結果（引き算）

![022minus](https://user-images.githubusercontent.com/101798620/168427780-649dfd31-817a-4e35-b5ed-9ae3debee8ff.png)
***
▼０を入力の結果（１，２以外）

![020Zero](https://user-images.githubusercontent.com/101798620/168427824-75b4e4ff-9de3-49ac-b2e2-be823c958d88.png)