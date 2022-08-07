package th.co.geniustree.etda.sum.type;

/**
 *
 * @author pramoth
 */
sealed interface Shape{
}
record Circle() implements Shape{}
record Rectangle() implements Shape{}
record Oval()implements Shape{}