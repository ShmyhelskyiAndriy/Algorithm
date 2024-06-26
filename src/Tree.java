public class Tree<T extends Comparable>{

    private Treenode<T> root;

    static class Treenode<T> {
        T data;
        Treenode<T> left;
        Treenode<T> right;

        public Treenode(T data) {
            this.data = data;
        }
    }
        public void insertElement(T data) {
            if (root == null) {
                root = new Treenode<>(data);
                return;
            }
            insertNode(root, data);
        }

        private void insertNode(Treenode<T> root, T data) {
            if (root.data.compareTo(data) > 0) {
                if (root.left == null) {
                    root.left = new Treenode<>(data);
                    return;
                }
                insertNode(root.left, data);
            } else if (root.data.compareTo(data) < 0) {
                if (root.right == null) {
                    root.right = new Treenode<>(data);
                    return;
                }
                insertNode(root.right, data);

            }
        }
        public void printTree(){
            printTree(root);
        }

        private void printTree(Treenode<T> root){
            if(root != null){
                printTree(root.left);
                System.out.println(root.data);
                printTree(root.right);
            }
        }

        public void deleteNode(T data){
        deleteNode(root, data);
        }

        private Treenode<T> deleteNode(Treenode<T> root, T data){
            if(root == null){return null;}
            if(root.data.compareTo(data) > 0 ){
                root.left = deleteNode(root.left, data);
            } else if (root.data.compareTo(data) < 0) {
                root.right = deleteNode(root.right, data);
            }else{
                if(root.left != null && root.right != null){
                    Treenode<T> minElemFromRight = getminElemFromRight(root.right);
                    root.data = minElemFromRight.data;
                    root.right = deleteNode(root.right, minElemFromRight.data);
                }else if(root.right != null){
                    root = root.right;
                } else if (root.left != null){
                    root = root.left;
                }else {
                    root = null;
                }
            }return root;
        }

        private Treenode<T> getminElemFromRight(Treenode<T> root){
            if(root.left == null){
                return root;
            } return getminElemFromRight(root.left);
        }
    }

