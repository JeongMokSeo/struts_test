package add.model;

import org.apache.struts.action.ActionForm;;

public class AddForm extends ActionForm {
        protected int op1;
        protected int op2;
       
        public int getOp1() {
                return op1;
        }
       
        public int getOp2() {
                return op2;
        }
       
        public void setOp1(int op1) {
                this.op1 = op1;
        }
       
        public void setOp2(int op2) {
                this.op2 = op2;
        }       
}
