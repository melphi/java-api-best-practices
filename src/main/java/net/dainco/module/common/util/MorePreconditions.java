package net.dainco.module.common.util;

import com.google.common.base.Strings;
import net.dainco.module.exception.BadRequestException;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Common preconditions.
 */
public final class MorePreconditions {
  public static void checkNotNullOrEmpty(String value) {
    checkArgument(!Strings.isNullOrEmpty(value), CommonConstants.ERROR_REQUIRED_VALUE_EMPTY_OR_NULL);
  }

  public static void checkNotNullOrEmptyWithBadRequest(String value) {
    if (Strings.isNullOrEmpty(value)) {
      throw new BadRequestException(CommonConstants.ERROR_REQUIRED_VALUE_EMPTY_OR_NULL);
    }
  }

  public static void checkPagination(Integer pageSize, Integer pageNum) throws BadRequestException {
    if (pageSize == null || pageSize <= 0) {
      throw new BadRequestException(CommonConstants.ERROR_INVALID_PAGE_SIZE);
    }
    if (pageNum == null || pageNum < 0) {
      throw new BadRequestException(CommonConstants.ERROR_INVALID_PAGE_NUMBER);
    }
  }
}
