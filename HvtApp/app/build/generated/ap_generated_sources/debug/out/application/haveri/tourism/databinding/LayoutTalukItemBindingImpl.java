package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutTalukItemBindingImpl extends LayoutTalukItemBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutTalukItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LayoutTalukItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[6]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[5]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[7]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            );
        this.cardContent.setTag(null);
        this.ivTaluk.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvDistance.setTag(null);
        this.tvEventsCount.setTag(null);
        this.tvPlaceCount.setTag(null);
        this.tvTalukDesc.setTag(null);
        this.tvTalukName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback22 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImageUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelDistanceInKm((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelTalukName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelTalukDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPlaceCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelEventCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(androidx.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDistanceInKm(androidx.databinding.ObservableField<java.lang.String> ViewModelDistanceInKm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTalukName(androidx.databinding.ObservableField<java.lang.String> ViewModelTalukName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTalukDescription(androidx.databinding.ObservableField<java.lang.String> ViewModelTalukDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlaceCount(androidx.databinding.ObservableField<java.lang.String> ViewModelPlaceCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventCount(androidx.databinding.ObservableField<java.lang.String> ViewModelEventCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        java.lang.String viewModelTalukDescriptionGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelDistanceInKm = null;
        java.lang.String viewModelDistanceInKmGet = null;
        java.lang.String viewModelPlaceCountGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTalukName = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTalukDescription = null;
        java.lang.String commonUtilsToHtmlViewModelTalukDescription = null;
        java.lang.String viewModelTalukNameGet = null;
        java.lang.String viewModelImageUrlGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPlaceCount = null;
        application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapterViewModel viewModel = mViewModel;
        java.lang.String viewModelEventCountGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventCount = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.imageUrl;
                    }
                    updateRegistration(0, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.distanceInKm
                        viewModelDistanceInKm = viewModel.distanceInKm;
                    }
                    updateRegistration(1, viewModelDistanceInKm);


                    if (viewModelDistanceInKm != null) {
                        // read viewModel.distanceInKm.get()
                        viewModelDistanceInKmGet = viewModelDistanceInKm.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.talukName
                        viewModelTalukName = viewModel.talukName;
                    }
                    updateRegistration(2, viewModelTalukName);


                    if (viewModelTalukName != null) {
                        // read viewModel.talukName.get()
                        viewModelTalukNameGet = viewModelTalukName.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.talukDescription
                        viewModelTalukDescription = viewModel.talukDescription;
                    }
                    updateRegistration(3, viewModelTalukDescription);


                    if (viewModelTalukDescription != null) {
                        // read viewModel.talukDescription.get()
                        viewModelTalukDescriptionGet = viewModelTalukDescription.get();
                    }


                    // read CommonUtils.toHtml(viewModel.talukDescription.get())
                    commonUtilsToHtmlViewModelTalukDescription = application.haveri.tourism.utils.CommonUtils.toHtml(viewModelTalukDescriptionGet);
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.placeCount
                        viewModelPlaceCount = viewModel.placeCount;
                    }
                    updateRegistration(4, viewModelPlaceCount);


                    if (viewModelPlaceCount != null) {
                        // read viewModel.placeCount.get()
                        viewModelPlaceCountGet = viewModelPlaceCount.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventCount
                        viewModelEventCount = viewModel.eventCount;
                    }
                    updateRegistration(5, viewModelEventCount);


                    if (viewModelEventCount != null) {
                        // read viewModel.eventCount.get()
                        viewModelEventCountGet = viewModelEventCount.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageUrl(this.ivTaluk, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback22);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDistance, viewModelDistanceInKmGet);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEventsCount, viewModelEventCountGet);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPlaceCount, viewModelPlaceCountGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTalukDesc, commonUtilsToHtmlViewModelTalukDescription);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTalukName, viewModelTalukNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapterViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onItemClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.imageUrl
        flag 1 (0x2L): viewModel.distanceInKm
        flag 2 (0x3L): viewModel.talukName
        flag 3 (0x4L): viewModel.talukDescription
        flag 4 (0x5L): viewModel.placeCount
        flag 5 (0x6L): viewModel.eventCount
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}