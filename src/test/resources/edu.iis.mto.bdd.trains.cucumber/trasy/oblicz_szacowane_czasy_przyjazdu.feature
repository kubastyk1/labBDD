# language: pl
Funkcja: Informacja dla podróżnych o czasie przybycia do stacji docelowej
	W celu bardziej efektywnego planowania podróży
	Jako podróżny
	Chcę wiedzieć, o której godzinie dotrę do stacji docelowej

Szablon Scenariusza: Szacowanie czasu przejazdu
	Zakładając chcę się dostać z "<from>" do "<to>"
	I następny pociąg na linii "<line>" odjeżdża o "<startTime>"
	Gdy zapytam o godzinę przyjazdu
	Wtedy powinienem uzyskać następujący szacowany czas przyjazdu "<expectedTime>"

	Przykłady:
	| from      | to       | line      | startTime | expectedTime |
    | Paramatta | TownHall | Western   | 8:02      | 8:29         |
	| Epping    | Central  | Northern  | 8:03      | 8:48         |
	| Epping    | Central  | Newcastle | 8:07      | 8:37         |
	| Epping    | Central  | Epping    | 8:13      | 8:51         |