/*
objective: move all disks from A to C
for height of 3:
move disk 1 from A to C
move disk 2 from A to B
move disk 1 from C to B
move disk 3 from A to C
move disk 1 from B to A
move disk 2 from B to C
move disk 1 from A to C
*/

class HanoiTowerPuzzle {
  public static void main(String[] args) {
    HanoiTowerPuzzle puzzle = new HanoiTowerPuzzle();
    puzzle.solve(4);
  }

  void solve(int n) {
    solverHelper(n, 'A', 'C', 'B');
  }
  
  void solverHelper(int numOfDisks, char fromTower, char toTower, char auxTower) {
  
    if (numOfDisks == 0) return; // base case
    solverHelper(numOfDisks-1, fromTower, auxTower, toTower);
    moveOneDisk(numOfDisks, fromTower, toTower);
    solverHelper(numOfDisks-1, auxTower, toTower, fromTower);
  }
  
  void moveOneDisk(int diskNo, char fromTower, char toTower) {
    System.out.printf("move disk %d from %c to %c\n", diskNo, fromTower, toTower);
  }
}


