PhoneBook CLI

STEP0：今回作るアプリの仕様
📱 連絡先（電話帳）CLI アプリ
📌 機能

連絡先の追加（名前・電話番号）

連絡先一覧表示

連絡先削除（ID 指定）

📌 クラス構成

Contact

ContactRepository

Main

ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー

🔷 STEP1：Contact クラスを作る

まずデータクラスからいきます。

📝 問題（STEP1）

Contact クラスを以下のように作ってください：

🎯 フィールド（private）

int id

String name

String phone

🎯 実装するメソッド
(1) 3つのフィールドをセットするコンストラクタ

public Contact(int id, String name, String phone)

(2) 各フィールドの getter

getId()

getName()

getPhone()

ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
📝 問題（STEP2）

ContactRepository クラスを作ってください。

🎯 フィールド
private List<Contact> contacts = new ArrayList<>();

🎯 作るメソッド
(1) add(Contact contact)

contacts に追加するだけ。

(2) findAll()

contacts をそのまま返す。

(3) delete(int id)

ID が一致した要素を削除する。

------------------------------------------------------------------
📝 問題（STEP3） Main クラスを作る

以下の CLI メニューを持つアプリを作ってください：

=== PhoneBook ===
1. Add Contact
2. List Contacts
3. Delete Contact
4. Exit

🎯 必須仕様（書くべきコード）
(1) Scanner の用意
Scanner scanner = new Scanner(System.in);

(2) Repository の生成
ContactRepository repo = new ContactRepository();

(3) ID 自動採番
int nextId = 1;

🎯 各コマンドの処理内容
1. Add Contact

「Name:」と表示して name を入力

「Phone:」と表示して phone を入力

new Contact(nextId++, name, phone) を作成

repo.add(contact) する

「Added!」と表示

2. List Contacts

repo.findAll() を for 文で回す

表示形式は：

[id] name - phone

3. Delete Contact

「Delete ID:」と表示

int id を入力

repo.delete(id)

4. Exit

「Bye!」と表示して終了（return）

📌 注意点

switch の case には必ず break を入れる

nextInt() の後には scanner.nextLine() を入れる


