package composite_pattern

fun main(){
    val root = Composite("Root")
    val branchFirst = Composite("BranchFirst")
    val branchSecond = Composite("BranchSecond")

    val leafFirst = Leaf("LeafFirst")
    val leafSecond = Leaf("LeafSecond")

    branchFirst.addChild(leafFirst)
    branchSecond.addChild(leafSecond)

    root.addChild(branchFirst)
    root.addChild(branchSecond)

    root.doSomething()
}