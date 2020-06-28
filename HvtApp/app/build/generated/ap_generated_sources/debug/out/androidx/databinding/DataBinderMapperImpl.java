package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new application.haveri.tourism.DataBinderMapperImpl());
  }
}
