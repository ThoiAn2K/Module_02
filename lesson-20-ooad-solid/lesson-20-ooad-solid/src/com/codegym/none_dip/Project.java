package com.codegym.none_dip;

// We have:
// - 2 low level module: BEDev, FEDev
// - 1 high level module: Project
// Assume in the future, we change:
// - beDev code C# instead of Java
// - feDev code VueJS instead of ReactJS
// => We'll change code not only low level module,
// but also high level module (closely dependent)
public class Project {

    private BEDeveloper be = new BEDeveloper();
    private FEDeveloper fe = new FEDeveloper();

    public void build() {
//        be.codeJava();
        be.codeCSharp();
//        fe.codeReactJS();
        fe.codeVueJS();
    }
}
