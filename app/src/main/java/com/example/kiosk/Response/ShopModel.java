package com.example.kiosk.Response;

import java.io.Serializable;
import java.util.List;

public class ShopModel {

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        private List<Llist> list;

        public List<Llist> getList() {
            return list;
        }

        public void setList(List<Llist> list) {
            this.list = list;
        }

        public static class Llist implements Serializable {

            private Category category;
            private List<Items> items;

            public Category getCategory() {
                return category;
            }

            public void setCategory(Category category) {
                this.category = category;
            }

            public List<Items> getItems() {
                return items;
            }

            public void setItems(List<Items> items) {
                this.items = items;
            }

            public static class Category {

                private Integer id;

                private String name;

                private Integer appearenceOrder;

                private Boolean isActive;

                private Boolean isEcommerce;

                private String image;

                private String createdAt;

                private String updatedAt;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Integer getAppearenceOrder() {
                    return appearenceOrder;
                }

                public void setAppearenceOrder(Integer appearenceOrder) {
                    this.appearenceOrder = appearenceOrder;
                }

                public Boolean getIsActive() {
                    return isActive;
                }

                public void setIsActive(Boolean isActive) {
                    this.isActive = isActive;
                }

                public Boolean getIsEcommerce() {
                    return isEcommerce;
                }

                public void setIsEcommerce(Boolean isEcommerce) {
                    this.isEcommerce = isEcommerce;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

            }

            public static class Items implements Serializable {

                private BasePrice basePrice;

                private Price price;

                private Integer id;

                private Integer shopId;

                private Integer itemId;

                private Integer categoryId;

                private Integer seq;

                private Boolean isActive;

                private String createdAt;

                private String updatedAt;

                private Object deletedAt;

                private List<ShopMenuAddon> shopMenuAddons;

                private List<Object> shopMenuVariations;

                private MasterMenu masterMenu;

                private CategoryOne category;

                private String image;

                private String name;

                private String type;

                public BasePrice getBasePrice() {
                    return basePrice;
                }

                public void setBasePrice(BasePrice basePrice) {
                    this.basePrice = basePrice;
                }

                public Price getPrice() {
                    return price;
                }

                public void setPrice(Price price) {
                    this.price = price;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public Integer getShopId() {
                    return shopId;
                }

                public void setShopId(Integer shopId) {
                    this.shopId = shopId;
                }

                public Integer getItemId() {
                    return itemId;
                }

                public void setItemId(Integer itemId) {
                    this.itemId = itemId;
                }

                public Integer getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(Integer categoryId) {
                    this.categoryId = categoryId;
                }

                public Integer getSeq() {
                    return seq;
                }

                public void setSeq(Integer seq) {
                    this.seq = seq;
                }

                public Boolean getIsActive() {
                    return isActive;
                }

                public void setIsActive(Boolean isActive) {
                    this.isActive = isActive;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

                public Object getDeletedAt() {
                    return deletedAt;
                }

                public void setDeletedAt(Object deletedAt) {
                    this.deletedAt = deletedAt;
                }

                public List<ShopMenuAddon> getShopMenuAddons() {
                    return shopMenuAddons;
                }

                public void setShopMenuAddons(List<ShopMenuAddon> shopMenuAddons) {
                    this.shopMenuAddons = shopMenuAddons;
                }

                public List<Object> getShopMenuVariations() {
                    return shopMenuVariations;
                }

                public void setShopMenuVariations(List<Object> shopMenuVariations) {
                    this.shopMenuVariations = shopMenuVariations;
                }

                public MasterMenu getMasterMenu() {
                    return masterMenu;
                }

                public void setMasterMenu(MasterMenu masterMenu) {
                    this.masterMenu = masterMenu;
                }

                public CategoryOne getCategory() {
                    return category;
                }

                public void setCategory(CategoryOne category) {
                    this.category = category;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public class BasePrice {


                    private Double pickup;

                    private Double dineIn;

                    private Integer delivery;

                    private Integer eCommerce;

                    private Double packaging;

                    public Double getPickup() {
                        return pickup;
                    }

                    public void setPickup(Double pickup) {
                        this.pickup = pickup;
                    }

                    public Double getDineIn() {
                        return dineIn;
                    }

                    public void setDineIn(Double dineIn) {
                        this.dineIn = dineIn;
                    }

                    public Integer getDelivery() {
                        return delivery;
                    }

                    public void setDelivery(Integer delivery) {
                        this.delivery = delivery;
                    }

                    public Integer getECommerce() {
                        return eCommerce;
                    }

                    public void setECommerce(Integer eCommerce) {
                        this.eCommerce = eCommerce;
                    }

                    public Double getPackaging() {
                        return packaging;
                    }

                    public void setPackaging(Double packaging) {
                        this.packaging = packaging;
                    }

                }

                public class Price {

                    private Double pickup;

                    private Double dineIn;

                    private Integer delivery;

                    private Integer eCommerce;

                    private Double packaging;

                    public Double getPickup() {
                        return pickup;
                    }

                    public void setPickup(Double pickup) {
                        this.pickup = pickup;
                    }

                    public Double getDineIn() {
                        return dineIn;
                    }

                    public void setDineIn(Double dineIn) {
                        this.dineIn = dineIn;
                    }

                    public Integer getDelivery() {
                        return delivery;
                    }

                    public void setDelivery(Integer delivery) {
                        this.delivery = delivery;
                    }

                    public Integer getECommerce() {
                        return eCommerce;
                    }

                    public void setECommerce(Integer eCommerce) {
                        this.eCommerce = eCommerce;
                    }

                    public Double getPackaging() {
                        return packaging;
                    }

                    public void setPackaging(Double packaging) {
                        this.packaging = packaging;
                    }

                }

                public class MasterMenu {


                    private String name;

                    private String desc;

                    private String image;

                    private Category category;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public Category getCategory() {
                        return category;
                    }

                    public void setCategory(Category category) {
                        this.category = category;
                    }

                }

                public class ShopMenuAddon {


                    private Integer id;

                    private Integer itemId;

                    private Integer addonId;

                    private Integer shopId;
                    private PriceOne price;

                    private String createdAt;

                    private String updatedAt;

                    private Object deletedAt;

                    private Addon addon;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public Integer getItemId() {
                        return itemId;
                    }

                    public void setItemId(Integer itemId) {
                        this.itemId = itemId;
                    }

                    public Integer getAddonId() {
                        return addonId;
                    }

                    public void setAddonId(Integer addonId) {
                        this.addonId = addonId;
                    }

                    public Integer getShopId() {
                        return shopId;
                    }

                    public void setShopId(Integer shopId) {
                        this.shopId = shopId;
                    }

                    public PriceOne getPrice() {
                        return price;
                    }

                    public void setPrice(PriceOne price) {
                        this.price = price;
                    }

                    public String getCreatedAt() {
                        return createdAt;
                    }

                    public void setCreatedAt(String createdAt) {
                        this.createdAt = createdAt;
                    }

                    public String getUpdatedAt() {
                        return updatedAt;
                    }

                    public void setUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                    }

                    public Object getDeletedAt() {
                        return deletedAt;
                    }

                    public void setDeletedAt(Object deletedAt) {
                        this.deletedAt = deletedAt;
                    }

                    public Addon getAddon() {
                        return addon;
                    }

                    public void setAddon(Addon addon) {
                        this.addon = addon;
                    }

                    public class Addon {

                        private Integer id;

                        private String name;

                        private String image;

                        private PriceTwo price;

                        private String createdAt;

                        private String updatedAt;

                        private Object deletedAt;

                        public Integer getId() {
                            return id;
                        }

                        public void setId(Integer id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getImage() {
                            return image;
                        }

                        public void setImage(String image) {
                            this.image = image;
                        }

                        public PriceTwo getPrice() {
                            return price;
                        }

                        public void setPrice(PriceTwo price) {
                            this.price = price;
                        }

                        public String getCreatedAt() {
                            return createdAt;
                        }

                        public void setCreatedAt(String createdAt) {
                            this.createdAt = createdAt;
                        }

                        public String getUpdatedAt() {
                            return updatedAt;
                        }

                        public void setUpdatedAt(String updatedAt) {
                            this.updatedAt = updatedAt;
                        }

                        public Object getDeletedAt() {
                            return deletedAt;
                        }

                        public void setDeletedAt(Object deletedAt) {
                            this.deletedAt = deletedAt;
                        }


                        public class PriceTwo {

                            private Double pickup;

                            private Double dineIn;

                            private Double delivery;

                            public Double getPickup() {
                                return pickup;
                            }

                            public void setPickup(Double pickup) {
                                this.pickup = pickup;
                            }

                            public Double getDineIn() {
                                return dineIn;
                            }

                            public void setDineIn(Double dineIn) {
                                this.dineIn = dineIn;
                            }

                            public Double getDelivery() {
                                return delivery;
                            }

                            public void setDelivery(Double delivery) {
                                this.delivery = delivery;
                            }

                        }
                    }

                    public class PriceOne {

                        private Integer pickup;

                        private Integer dineIn;

                        private Integer delivery;

                        public Integer getPickup() {
                            return pickup;
                        }

                        public void setPickup(Integer pickup) {
                            this.pickup = pickup;
                        }

                        public Integer getDineIn() {
                            return dineIn;
                        }

                        public void setDineIn(Integer dineIn) {
                            this.dineIn = dineIn;
                        }

                        public Integer getDelivery() {
                            return delivery;
                        }

                        public void setDelivery(Integer delivery) {
                            this.delivery = delivery;
                        }

                    }
                }

                public class CategoryOne {

                    private Integer id;
                    private String name;
                    private Integer appearenceOrder;
                    private Boolean isActive;
                    private Boolean isEcommerce;

                    private String image;
                    private String createdAt;

                    private String updatedAt;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Integer getAppearenceOrder() {
                        return appearenceOrder;
                    }

                    public void setAppearenceOrder(Integer appearenceOrder) {
                        this.appearenceOrder = appearenceOrder;
                    }

                    public Boolean getIsActive() {
                        return isActive;
                    }

                    public void setIsActive(Boolean isActive) {
                        this.isActive = isActive;
                    }

                    public Boolean getIsEcommerce() {
                        return isEcommerce;
                    }

                    public void setIsEcommerce(Boolean isEcommerce) {
                        this.isEcommerce = isEcommerce;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getCreatedAt() {
                        return createdAt;
                    }

                    public void setCreatedAt(String createdAt) {
                        this.createdAt = createdAt;
                    }

                    public String getUpdatedAt() {
                        return updatedAt;
                    }

                    public void setUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                    }

                }
            }
        }
    }
}
