class Tree {
  public void treeLeaf() {
    System.out.println("The trees have different leaves:");
  }
}

class Birch extends Tree {
  public void treeLeaf() {
    System.out.println("The Birch has: Heart-shaped leaves");
  }
}

class HorseChestnut extends Tree {
  public void treeLeaf() {
    System.out.println("The HorseChestnut has: Compound centered leaves");
  }
}

class Ash extends Tree {
  public void treeLeaf() {
	System.out.println("The Ash has: Compound along the stem leaves");
  }
}

class Main {
  public static void main(String[] args) {
    Tree myTree = new Tree(); 
    Tree myBirch = new Birch();  
    Tree myHorseChestnut = new HorseChestnut(); 
    Tree myAsh = new Ash();
    myTree.treeLeaf();
    myBirch.treeLeaf();
    myHorseChestnut.treeLeaf();
    myAsh.treeLeaf();
    
  }
}