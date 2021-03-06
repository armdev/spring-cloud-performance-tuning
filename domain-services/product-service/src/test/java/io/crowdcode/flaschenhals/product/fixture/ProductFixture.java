package io.crowdcode.flaschenhals.product.fixture;

import io.crowdcode.flaschenhals.product.model.Product;

/**
 * Created by idueppe on 24.03.17.
 */
public class ProductFixture {
    public static Product buildDefaultProduct() {
        return new Product()
                .setName("PRODUCT_NAME")
                .setDescription("PRODUCT_DESCRIPTION")
                .setAmount(1.0d)
                .setUnit("Liter");
    }

    public static Product buildProduct(String productName) {
        return new Product()
                .setName(productName)
                .setDescription("PRODCUT_DESCRIPTION")
                .setAmount(0.750d)
                .setUnit("Liter");
    }

    public static Product buildPersistentProduct() {
        return new Product()
                .setName("PRODUCT_NAME_2")
                .setDescription("PRODUCT_DESCRIPTION_2")
                .setAmount(123.45d)
                .setUnit("1L")
                .setId(-2L);
    }

}
