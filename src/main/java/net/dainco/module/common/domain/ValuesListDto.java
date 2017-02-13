package net.dainco.module.common.domain;

import java.util.Collection;

/**
 * Common class which can be used to return a non paginated list of values.
 * @param <T> The class to be returned, it should be a Dto class.
 */
public class ValuesListDto<T> {
  private Collection<T> values;

  public ValuesListDto() {
    // Intentionally empty.
  }

  public ValuesListDto(Collection<T> values) {
    this.values = values;
  }

  public Collection<T> getValues() {
    return values;
  }
}
