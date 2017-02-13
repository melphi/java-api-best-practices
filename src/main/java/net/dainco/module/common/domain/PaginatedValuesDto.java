package net.dainco.module.common.domain;

import java.io.Serializable;
import java.util.Collection;

/**
 * Common class which can be used to return a paginated list of values.
 * @param <T> The class to be returned, it should be a Dto class.
 */
public class PaginatedValuesDto<T> implements Serializable {
  private Collection<T> values;
  private int pageNum;
  private int pageSize;
  private boolean hasMore;

  public PaginatedValuesDto() {
    // Intentionally empty.
  }

  public PaginatedValuesDto(Collection<T> values, int pageNum, int maxResults, boolean hasMore) {
    this.values = values;
    this.pageNum = pageNum;
    this.pageSize = maxResults;
    this.hasMore = hasMore;
  }

  public int getPageNum() {
    return pageNum;
  }

  public int getPageSize() {
    return pageSize;
  }

  public boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(boolean hasMore) {
    this.hasMore = hasMore;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public Collection<T> getValues() {
    return values;
  }
}
