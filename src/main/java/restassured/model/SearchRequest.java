package restassured.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchRequest {
    @JsonProperty("query")
    private String query;
    @JsonProperty("merchant_id")
    private Integer merchantId;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("category_slug")
    private String categorySlug;
    @JsonProperty("min_commission")
    private Integer minCommission;
    @JsonProperty("max_commission")
    private Integer maxCommission;
    @JsonProperty("min_price")
    private Integer minPrice;
    @JsonProperty("max_price")
    private Integer maxPrice;

    private SearchRequest(SearchRequestBuilder searchRequestBuilder) {
        this.query = searchRequestBuilder.query;
        this.merchantId = searchRequestBuilder.merchantId;
        this.categoryId = searchRequestBuilder.categoryId;
        this.categorySlug = searchRequestBuilder.categorySlug;
        this.minCommission = searchRequestBuilder.minCommission;
        this.maxCommission = searchRequestBuilder.maxCommission;
        this.minPrice = searchRequestBuilder.minPrice;
        this.maxPrice = searchRequestBuilder.maxPrice;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public Integer getMinCommission() {
        return minCommission;
    }

    public void setMinCommission(int minCommission) {
        this.minCommission = minCommission;
    }

    public Integer getMaxCommission() {
        return maxCommission;
    }

    public void setMaxCommission(int maxCommission) {
        this.maxCommission = maxCommission;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public static class SearchRequestBuilder {
        private String query;
        private Integer merchantId;
        private String categoryId;
        private String categorySlug;
        private Integer minCommission;
        private Integer maxCommission;
        private Integer minPrice;
        private Integer maxPrice;

        public SearchRequestBuilder withQuery( final String query) {
            this.query = query;
            return this;
        }

        public SearchRequestBuilder withMerchantId(final int merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public SearchRequestBuilder withCategoryId(final String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public SearchRequestBuilder withCategorySlug(final String categorySlug) {
            this.categorySlug = categorySlug;
            return this;
        }

        public SearchRequestBuilder withMinCommission(final int minCommission) {
            this.minCommission = minCommission;
            return this;
        }

        public SearchRequestBuilder withMaxCommission(final int maxCommission) {
            this.maxCommission = maxCommission;
            return this;
        }

        public SearchRequestBuilder withMinPrice(final int minPrice) {
            this.minPrice = minPrice;
            return this;
        }

        public SearchRequestBuilder withMaxPrice(final int maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public SearchRequest build() { return new SearchRequest(this); }
    }
}
