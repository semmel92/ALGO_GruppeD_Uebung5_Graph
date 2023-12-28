# Merge Sort
Divide & Conquer # Merge Sort
Divide & Conquer

Funktionsweise:
1) Liste in zwei Hälften zerlegen. So lange machen bis nur noch ein Element in einem Teilstück vorhanden ist.
2) Sortieren aller Teilstücke
3) Teilstücke wieder zu einer Menge vermischen. Sortiert zusammenführen.

Beispiel:
[5 2 4 8 1 9 7 3 6]                         <br/>
[5 2 4 8] [1 9 7 3 6]                       <br/>
[5 2] [4 8] [1 9] [7] [3 6]                 <br/>
[5] [2] [4] [8] [1] [9] [7] [3 6]           <br/>
[5] [2] [4] [8] [1] [9] [7] [3] [6]         <br/>
[2 5] [4 8] [1 9] [7 3] [6]                 <br/>
[2 4 5 8] [1 9] [3 6 7]                     <br/>
[2 4 5 8] [1 3 6 7 9]                       <br/>
[1 2 3 4 5 6 7 8 9]                         <br/>

Pseudocode:
mergeSort(List list) {
    if a <= 1
    do
        int mitte = list.length / 2
        int left = mitte - 1
        int right = list.length - mitte - 1
        Liste leftList = mergeSort(left)
        Liste rightList = mergeSort(right)
        return merge(leftList, rightList)
}

Funktionsweise:
1) Liste in zwei Hälften zerlegen. So lange machen bis nur noch ein Element in einem Teilstück vorhanden ist.
2) Sortieren aller Teilstücke
3) Teilstücke wieder zu einer Menge vermischen. Sortiert zusammenführen.

Beispiel:
[5 2 4 8 1 9 7 3 6]                         <br/>
[5 2 4 8] [1 9 7 3 6]                       <br/>
[5 2] [4 8] [1 9] [7] [3 6]                 <br/>
[5] [2] [4] [8] [1] [9] [7] [3 6]           <br/>
[5] [2] [4] [8] [1] [9] [7] [3] [6]         <br/>
[2 5] [4 8] [1 9] [7 3] [6]                 <br/>
[2 4 5 8] [1 9] [3 6 7]                     <br/>
[2 4 5 8] [1 3 6 7 9]                       <br/>
[1 2 3 4 5 6 7 8 9]                         <br/>

Pseudocode:
mergeSort(List list) {
    if a <= 1
    do
        int mitte = list.length / 2
        int left = mitte - 1
        int right = list.length - mitte - 1
        Liste leftList = mergeSort(left)
        Liste rightList = mergeSort(right)
        return merge(leftList, rightList)
}