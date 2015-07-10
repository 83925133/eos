package com.whale.eos.basic.util;

import java.lang.reflect.Field;

public abstract interface ClassFieldFilter {
	public abstract boolean isFilter(Class<?> paramClass, Field paramField);
}
