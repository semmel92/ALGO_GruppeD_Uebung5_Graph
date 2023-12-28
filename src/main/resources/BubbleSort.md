# BubbleSort Infos:
Vergleichsbasierter Sortieralgorithmus
Paarweiser vergleich von links nach rechts

Laufzeit:
Average-Case & Worst-Case O(n²)
Best-Case O(n²)

*) Größere Zahlen steigen schneller auf

Beispiel:
5 1 4 9 0 8 6

[5 1] 4 9 0 8 6 <br/>
[1 5] 4 9 0 8 6 <br/>
1 [5 4] 9 0 8 6 <br/>
1 4 [5 9] 0 8 6 <br/>
1 4 5 [9 0] 8 6 <br/>
1 4 5 0 [9 8] 6 <br/>
1 4 5 0 8 [9 6] <br/>
[1 4] 5 0 8 6 {9} <br/>
1 [4 5] 0 8 6 {9} <br/>
1 4 [5 0] 8 6 {9} <br/>
1 4 0 [5 8] 6 {9} <br/>
1 4 0 5 [8 6] {9} <br/>
[1 4] 0 5 6 {8 9} <br/>
1 [4 0] 5 6 {8 9} <br/>
1 0 [4 5] 6 {8 9} <br/>
1 0 4 [5 6] {8 9} <br/>
[1 0] 4 5 {6 8 9} <br/>
0 [1 4] 5 {6 8 9} <br/>
0 1 [4 5] {6 8 9} <br/>
[0 1] 4 {5 6 8 9} <br/>
0 [1 4] {5 6 8 9} <br/>
[0 1] {4 5 6 8 9} <br/>
{0 1 4 5 6 8 9} <br/>

Pseudocode:
Array array
a = array.Anzahl
    for(b=0; b < a - 1; b++) {
        if(array[b] > array[b+1]){
            temp = array[b];
            array[b] = array[b+1];
            array[b+1] = temp;
        }
    }
a = a - 1