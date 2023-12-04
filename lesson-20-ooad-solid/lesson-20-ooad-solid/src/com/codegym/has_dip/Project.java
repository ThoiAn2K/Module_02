package com.codegym.has_dip;

// Reduce dependency by using abstraction interface
public class Project {

    private Developer be = new BEDeveloper();
    private Developer fe = new FEDeveloper();

    public void build() {
        be.develop();//code Java
        fe.develop();//code ReactJS
    }

    public static void main(String[] args) {
        Project project = new Project();
        project.build();
    }
}
