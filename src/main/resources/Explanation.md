# Floyd Warshall Algorithmus

## Theorie:
1. Wird verwendet, um den kürzesten Weg innerhalb eines Graphen zwischen allen Paaren von Knoten zu berechnen.
2. Der Floyd-Warshall-Algorithmus wird auch als Tripel-Algorithmus bezeichnet.
3. Der Algorithmus kann sowohl mit positiven als auch mit negativen Kantengewichten (aber ohne negative Zyklen) umgehen.
4. Er berechnet nicht nur die kürzeste Distanz zwischen zwei Knotenpaaren, sondern zwischen allen Knoten eines gewichteten Graphen.
5. Der Algorithmus besteht aus drei verschachtelten Schleifen und aktualisiert die Distanzen zwischen allen Paaren von Knoten, indem er jeweils einen Knoten als Zwischenstopp in Betracht zieht.

## Funktionsweise:
1. **Initialisierung:** Die Ausgangsmatrix wird vorbereitet, wobei die direkten Distanzen zwischen den Knoten eingetragen werden. Ist kein direkter Pfad vorhanden, wird der Eintrag als unendlich (INF) markiert.
2. **Aktualisierung:** Für jeden Knoten wird überprüft, ob die Distanz zwischen zwei anderen Knoten verkürzt werden kann, indem dieser Knoten als Zwischenstopp genutzt wird.
3. **Endergebnis:** Die finale Matrix gibt die kürzesten Distanzen zwischen allen Paaren von Knoten an.
