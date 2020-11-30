package Decorator;

public class Main {
    public static void main(String[] args) {
        ChristmasTree treeWithBubble = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(treeWithBubble.decorate());

        ChristmasTree treeWithBubbleAndGarland = new Garland(new BubbleLights(new ChristmasTreeImpl()));
        System.out.println(treeWithBubbleAndGarland.decorate());
    }
}
