/*
 * 
 * 
 * 
 */
package Days_of_Code;

public interface TreeDay22<D extends Comparable> {

    //If the tree is Empty return true
    public boolean isEmpty();

    //This is the size of the tree using recursion
    public int cardinality();

    // We will use Generics
    public boolean member(D element);

    //
    public nonEmptyBST<D> add(D element);

    public static class nonEmptyBST<D extends Comparable> implements TreeDay22<D> {

        D data;
        TreeDay22<D> left;
        TreeDay22<D> right;

        public nonEmptyBST(D element) {
            data = element;
            left = new EmptyBST<D>();
            right = new EmptyBST<D>();

        }

        public nonEmptyBST(D element, TreeDay22<D> leftTree, TreeDay22<D> rightTree) {
            data = element;
            left = leftTree;
            right = rightTree;

        }

        public boolean isEmpty() {
            return false;
        }

        public int cardinality() {
            return 1 + left.cardinality() + right.cardinality();
        }

        public boolean member(D element) {
            //here data == root
            if (data == element) {
                return true;
            } else {
                // again data == root
                if (element.compareTo(data) < 0) {
                    return left.member(element);

                } else {
                    return right.member(element);
                }//end else if
            }//end else

        }//end method memeber

        public nonEmptyBST<D> add(D element) {
            if (data == element) {
                return this;
            } else {
                if (element.compareTo(data) < 0) {
                    return new nonEmptyBST<D>(data, left.add(element), right);
                } else {
                    return new nonEmptyBST<D>(data, left, right.add(element));
                }
            }

        }
        public void getSize(nonEmptyBST<D> element){
            element.cardinality();
        }

    }

    public static class EmptyBST<D extends Comparable> implements TreeDay22<D> {

        public EmptyBST() {
        }

        public boolean isEmpty() {
            return true;
        }

        public int cardinality() {
            return 0;
        }

        public boolean member(D element) {
            return false;
        }

        //Create a nonEmpty tree
        public nonEmptyBST<D> add(D element) {
           return new nonEmptyBST<D>(element);
        }
        
    }

}
