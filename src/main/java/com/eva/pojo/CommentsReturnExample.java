package com.eva.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentsReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsReturnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdIsNull() {
            addCriterion("client_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdIsNotNull() {
            addCriterion("client_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdEqualTo(Long value) {
            addCriterion("client_comment_id =", value, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdNotEqualTo(Long value) {
            addCriterion("client_comment_id <>", value, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdGreaterThan(Long value) {
            addCriterion("client_comment_id >", value, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_comment_id >=", value, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdLessThan(Long value) {
            addCriterion("client_comment_id <", value, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("client_comment_id <=", value, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdIn(List<Long> values) {
            addCriterion("client_comment_id in", values, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdNotIn(List<Long> values) {
            addCriterion("client_comment_id not in", values, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdBetween(Long value1, Long value2) {
            addCriterion("client_comment_id between", value1, value2, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("client_comment_id not between", value1, value2, "clientCommentId");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateIsNull() {
            addCriterion("return_comment_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateIsNotNull() {
            addCriterion("return_comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateEqualTo(Date value) {
            addCriterionForJDBCDate("return_comment_date =", value, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("return_comment_date <>", value, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("return_comment_date >", value, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_comment_date >=", value, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateLessThan(Date value) {
            addCriterionForJDBCDate("return_comment_date <", value, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_comment_date <=", value, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateIn(List<Date> values) {
            addCriterionForJDBCDate("return_comment_date in", values, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("return_comment_date not in", values, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_comment_date between", value1, value2, "returnCommentDate");
            return (Criteria) this;
        }

        public Criteria andReturnCommentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_comment_date not between", value1, value2, "returnCommentDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}