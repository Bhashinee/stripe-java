package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InvoiceItemCreateParams extends ApiRequestParams {
  /**
   * The integer amount in <strong>%s</strong> of the charge to be applied to the upcoming invoice.
   * Passing in a negative {@code amount} will reduce the {@code amount_due} on the invoice.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer who will be billed when this invoice item is billed. */
  @SerializedName("customer")
  String customer;

  /**
   * An arbitrary string which you can attach to the invoice item. The description is displayed in
   * the invoice for easy tracking.
   */
  @SerializedName("description")
  String description;

  /**
   * Controls whether discounts apply to this invoice item. Defaults to false for prorations or
   * negative invoice items, and true for all other invoice items.
   */
  @SerializedName("discountable")
  Boolean discountable;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item
   * will be added to the next upcoming scheduled invoice. This is useful when adding invoice items
   * in response to an invoice.created webhook. You can only add invoice items to draft invoices.
   */
  @SerializedName("invoice")
  String invoice;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to {@code
   * metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The period associated with this invoice item. */
  @SerializedName("period")
  Period period;

  /** The ID of the price object. */
  @SerializedName("price")
  String price;

  /** Data used to generate a new price object inline. */
  @SerializedName("price_data")
  PriceData priceData;

  /** Non-negative integer. The quantity of units for the invoice item. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * The ID of a subscription to add this invoice item to. When left blank, the invoice item will be
   * be added to the next upcoming scheduled invoice. When set, scheduled invoices for subscriptions
   * other than the specified subscription will ignore the invoice item. Use this when you want to
   * express that an invoice item has been accrued within the context of a particular subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this invoice item.
   */
  @SerializedName("tax_rates")
  List<String> taxRates;

  /**
   * The integer unit amount in <strong>%s</strong> of the charge to be applied to the upcoming
   * invoice. This {@code unit_amount} will be multiplied by the quantity to get the full amount.
   * Passing in a negative {@code unit_amount} will reduce the {@code amount_due} on the invoice.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
   * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  private InvoiceItemCreateParams(
      Long amount,
      String currency,
      String customer,
      String description,
      Boolean discountable,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoice,
      Object metadata,
      Period period,
      String price,
      PriceData priceData,
      Long quantity,
      String subscription,
      List<String> taxRates,
      Long unitAmount,
      BigDecimal unitAmountDecimal) {
    this.amount = amount;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.discountable = discountable;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.metadata = metadata;
    this.period = period;
    this.price = price;
    this.priceData = priceData;
    this.quantity = quantity;
    this.subscription = subscription;
    this.taxRates = taxRates;
    this.unitAmount = unitAmount;
    this.unitAmountDecimal = unitAmountDecimal;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String customer;

    private String description;

    private Boolean discountable;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoice;

    private Object metadata;

    private Period period;

    private String price;

    private PriceData priceData;

    private Long quantity;

    private String subscription;

    private List<String> taxRates;

    private Long unitAmount;

    private BigDecimal unitAmountDecimal;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceItemCreateParams build() {
      return new InvoiceItemCreateParams(
          this.amount,
          this.currency,
          this.customer,
          this.description,
          this.discountable,
          this.expand,
          this.extraParams,
          this.invoice,
          this.metadata,
          this.period,
          this.price,
          this.priceData,
          this.quantity,
          this.subscription,
          this.taxRates,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /**
     * The integer amount in <strong>%s</strong> of the charge to be applied to the upcoming
     * invoice. Passing in a negative {@code amount} will reduce the {@code amount_due} on the
     * invoice.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** The ID of the customer who will be billed when this invoice item is billed. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in
     * the invoice for easy tracking.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Controls whether discounts apply to this invoice item. Defaults to false for prorations or
     * negative invoice items, and true for all other invoice items.
     */
    public Builder setDiscountable(Boolean discountable) {
      this.discountable = discountable;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceItemCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceItemCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item
     * will be added to the next upcoming scheduled invoice. This is useful when adding invoice
     * items in response to an invoice.created webhook. You can only add invoice items to draft
     * invoices.
     */
    public Builder setInvoice(String invoice) {
      this.invoice = invoice;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceItemCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceItemCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The period associated with this invoice item. */
    public Builder setPeriod(Period period) {
      this.period = period;
      return this;
    }

    /** The ID of the price object. */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }

    /** Data used to generate a new price object inline. */
    public Builder setPriceData(PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /** Non-negative integer. The quantity of units for the invoice item. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of a subscription to add this invoice item to. When left blank, the invoice item will
     * be be added to the next upcoming scheduled invoice. When set, scheduled invoices for
     * subscriptions other than the specified subscription will ignore the invoice item. Use this
     * when you want to express that an invoice item has been accrued within the context of a
     * particular subscription.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#taxRates} for the field documentation.
     */
    public Builder addTaxRate(String element) {
      if (this.taxRates == null) {
        this.taxRates = new ArrayList<>();
      }
      this.taxRates.add(element);
      return this;
    }

    /**
     * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#taxRates} for the field documentation.
     */
    public Builder addAllTaxRate(List<String> elements) {
      if (this.taxRates == null) {
        this.taxRates = new ArrayList<>();
      }
      this.taxRates.addAll(elements);
      return this;
    }

    /**
     * The integer unit amount in <strong>%s</strong> of the charge to be applied to the upcoming
     * invoice. This {@code unit_amount} will be multiplied by the quantity to get the full amount.
     * Passing in a negative {@code unit_amount} will reduce the {@code amount_due} on the invoice.
     */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
     * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }
  }

  @Getter
  public static class Period {
    /** The end of the period, which must be greater than or equal to the start. */
    @SerializedName("end")
    Long end;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The start of the period. */
    @SerializedName("start")
    Long start;

    private Period(Long end, Map<String, Object> extraParams, Long start) {
      this.end = end;
      this.extraParams = extraParams;
      this.start = start;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long end;

      private Map<String, Object> extraParams;

      private Long start;

      /** Finalize and obtain parameter instance from this builder. */
      public Period build() {
        return new Period(this.end, this.extraParams, this.start);
      }

      /** The end of the period, which must be greater than or equal to the start. */
      public Builder setEnd(Long end) {
        this.end = end;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemCreateParams.Period#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceItemCreateParams.Period#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The start of the period. */
      public Builder setStart(Long start) {
        this.start = start;
        return this;
      }
    }
  }

  @Getter
  public static class PriceData {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the product that this price will belong to. */
    @SerializedName("product")
    String product;

    /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
    @SerializedName("recurring")
    Recurring recurring;

    /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
     * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    private PriceData(
        String currency,
        Map<String, Object> extraParams,
        String product,
        Recurring recurring,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.product = product;
      this.recurring = recurring;
      this.unitAmount = unitAmount;
      this.unitAmountDecimal = unitAmountDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String product;

      private Recurring recurring;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceData build() {
        return new PriceData(
            this.currency,
            this.extraParams,
            this.product,
            this.recurring,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemCreateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceItemCreateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the product that this price will belong to. */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
      public Builder setRecurring(Recurring recurring) {
        this.recurring = recurring;
        return this;
      }

      /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places.
       * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    @Getter
    public static class Recurring {
      /**
       * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed
       * values are {@code sum} for summing up all usage during a period, {@code last_during_period}
       * for using the last usage record reported within a period, {@code last_ever} for using the
       * last usage record ever (across period bounds) or {@code max} which uses the usage record
       * with the maximum reported usage during a period. Defaults to {@code sum}.
       */
      @SerializedName("aggregate_usage")
      AggregateUsage aggregateUsage;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
       * year}.
       */
      @SerializedName("interval")
      Interval interval;

      /**
       * The number of intervals between subscription billings. For example, {@code interval=month}
       * and {@code interval_count=3} bills every 3 months. Maximum of one year interval allowed (1
       * year, 12 months, or 52 weeks).
       */
      @SerializedName("interval_count")
      Long intervalCount;

      /**
       * Default number of trial days when subscribing a customer to this price using <a
       * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
       * trial_from_plan=true}</a>.
       */
      @SerializedName("trial_period_days")
      Long trialPeriodDays;

      /**
       * Configures how the quantity per period should be determined. Can be either {@code metered}
       * or {@code licensed}. {@code licensed} automatically bills the {@code quantity} set when
       * adding it to a subscription. {@code metered} aggregates the total usage based on usage
       * records. Defaults to {@code licensed}.
       */
      @SerializedName("usage_type")
      UsageType usageType;

      private Recurring(
          AggregateUsage aggregateUsage,
          Map<String, Object> extraParams,
          Interval interval,
          Long intervalCount,
          Long trialPeriodDays,
          UsageType usageType) {
        this.aggregateUsage = aggregateUsage;
        this.extraParams = extraParams;
        this.interval = interval;
        this.intervalCount = intervalCount;
        this.trialPeriodDays = trialPeriodDays;
        this.usageType = usageType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AggregateUsage aggregateUsage;

        private Map<String, Object> extraParams;

        private Interval interval;

        private Long intervalCount;

        private Long trialPeriodDays;

        private UsageType usageType;

        /** Finalize and obtain parameter instance from this builder. */
        public Recurring build() {
          return new Recurring(
              this.aggregateUsage,
              this.extraParams,
              this.interval,
              this.intervalCount,
              this.trialPeriodDays,
              this.usageType);
        }

        /**
         * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed
         * values are {@code sum} for summing up all usage during a period, {@code
         * last_during_period} for using the last usage record reported within a period, {@code
         * last_ever} for using the last usage record ever (across period bounds) or {@code max}
         * which uses the usage record with the maximum reported usage during a period. Defaults to
         * {@code sum}.
         */
        public Builder setAggregateUsage(AggregateUsage aggregateUsage) {
          this.aggregateUsage = aggregateUsage;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceItemCreateParams.PriceData.Recurring#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceItemCreateParams.PriceData.Recurring#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
         * year}.
         */
        public Builder setInterval(Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
         * interval allowed (1 year, 12 months, or 52 weeks).
         */
        public Builder setIntervalCount(Long intervalCount) {
          this.intervalCount = intervalCount;
          return this;
        }

        /**
         * Default number of trial days when subscribing a customer to this price using <a
         * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
         * trial_from_plan=true}</a>.
         */
        public Builder setTrialPeriodDays(Long trialPeriodDays) {
          this.trialPeriodDays = trialPeriodDays;
          return this;
        }

        /**
         * Configures how the quantity per period should be determined. Can be either {@code
         * metered} or {@code licensed}. {@code licensed} automatically bills the {@code quantity}
         * set when adding it to a subscription. {@code metered} aggregates the total usage based on
         * usage records. Defaults to {@code licensed}.
         */
        public Builder setUsageType(UsageType usageType) {
          this.usageType = usageType;
          return this;
        }
      }

      public enum AggregateUsage implements ApiRequestParams.EnumParam {
        @SerializedName("last_during_period")
        LAST_DURING_PERIOD("last_during_period"),

        @SerializedName("last_ever")
        LAST_EVER("last_ever"),

        @SerializedName("max")
        MAX("max"),

        @SerializedName("sum")
        SUM("sum");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AggregateUsage(String value) {
          this.value = value;
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week"),

        @SerializedName("year")
        YEAR("year");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }

      public enum UsageType implements ApiRequestParams.EnumParam {
        @SerializedName("licensed")
        LICENSED("licensed"),

        @SerializedName("metered")
        METERED("metered");

        @Getter(onMethod_ = {@Override})
        private final String value;

        UsageType(String value) {
          this.value = value;
        }
      }
    }
  }
}
