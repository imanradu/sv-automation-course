package restassured.model;

public class SearchRequest {
    private String query;
    private int merchant_id;
    private String category_id;
    private String category_slug;
    private int min_commission;
    private int max_commission;
    private int min_price;
    private int max_price;

    private SearchRequest(SearchRequestBuilder searchRequestBuilder) {
        this.query = searchRequestBuilder.query;
        this.merchant_id = searchRequestBuilder.merchant_id;
        this.category_id = searchRequestBuilder.category_id;
        this.category_slug = searchRequestBuilder.category_slug;
        this.min_commission = searchRequestBuilder.min_commission;
        this.max_commission = searchRequestBuilder.max_commission;
        this.min_price = searchRequestBuilder.min_price;
        this.max_price = searchRequestBuilder.max_price;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_slug() {
        return category_slug;
    }

    public void setCategory_slug(String category_slug) {
        this.category_slug = category_slug;
    }

    public int getMin_commission() {
        return min_commission;
    }

    public void setMin_commission(int min_commission) {
        this.min_commission = min_commission;
    }

    public int getMax_commission() {
        return max_commission;
    }

    public void setMax_commission(int max_commission) {
        this.max_commission = max_commission;
    }

    public int getMin_price() {
        return min_price;
    }

    public void setMin_price(int min_price) {
        this.min_price = min_price;
    }

    public int getMax_price() {
        return max_price;
    }

    public void setMax_price(int max_price) {
        this.max_price = max_price;
    }

    public static class SearchRequestBuilder {
        private String query;
        private int merchant_id;
        private String category_id;
        private String category_slug;
        private int min_commission;
        private int max_commission;
        private int min_price;
        private int max_price;

        public SearchRequestBuilder withQuery( final String query) {
            this.query = query;
            return this;
        }

        public SearchRequestBuilder withMerchantId(final int merchant_id) {
            this.merchant_id = merchant_id;
            return this;
        }

        public SearchRequestBuilder withCategoryId(final String category_id) {
            this.category_id = category_id;
            return this;
        }

        public SearchRequestBuilder withCategorySlug(final String category_slug) {
            this.category_slug = category_slug;
            return this;
        }

        public SearchRequestBuilder withMinCommission(final int min_commission) {
            this.min_commission = min_commission;
            return this;
        }

        public SearchRequestBuilder withMaxCommission(final int max_commission) {
            this.max_commission = max_commission;
            return this;
        }

        public SearchRequestBuilder withMinPrice(final int min_price) {
            this.min_price = min_price;
            return this;
        }

        public SearchRequestBuilder withMaxPrice(final int max_price) {
            this.max_price = max_price;
            return this;
        }

        public SearchRequest build() { return new SearchRequest(this); }
    }
}
