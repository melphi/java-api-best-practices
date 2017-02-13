package net.dainco.module.common.domain;

/**
 * Common class which can be used to return a single value.
 * @param <T> The class to be returned, it should be primitive type.
 */
public class SingleValueDto<T> {
  private T value;

  public SingleValueDto() {
    // Intentionally empty.
  }

  public SingleValueDto(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }
}
