■ 1. メニュー表示

起動すると以下のメニューを表示する：

=== ToDo App ===

Add Todo
List Todos
Delete Todo
Exit

■ 2. 入力処理

Scanner scanner = new Scanner(System.in); を使う
数字を読み取って switch で分岐

■ 3. 動作仕様
(1) Add Todo
id は単純に 連番（1, 2, 3, ...） で OK
入力したタイトルを Todo にして repository.add() へ渡す
id の管理は Main 側の int counter を使ってよい

例：
int nextId = 1;
Todo todo = new Todo(nextId++, title);

(2) List Todos
repository.findAll() の結果をループして表示
[1] 買い物
[2] 掃除

(3) Delete Todo
削除したい id をユーザーに聞く
repository.delete(id) を呼ぶだけ

(4) Exit
ループを抜けてアプリ終了

package todo_app;
