package rentalService.external;

import lombok.Data;

@Data
public class MyOrder {

        private Long id;
        private String productName;
        private String rentalStatus;
        private Long returnId;
        private int rentalQty;
        /*
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public Long getRentalId() {
            return rentalId;
        }
        public void setRentalId(Long rentalId) {
            this.rentalId = rentalId;
        }
        public Integer getQty() {
            return qty;
        }
        public void setQty(Integer qty) {
            this.qty = qty;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }*/

}
