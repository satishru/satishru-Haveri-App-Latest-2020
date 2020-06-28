package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutHomePlaceItemBindingImpl extends LayoutHomePlaceItemBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

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
    private final android.widget.RelativeLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutHomePlaceItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LayoutHomePlaceItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.cardview.widget.CardView) bindings[0]
            , (application.haveri.tourism.ui.custom.SquareImageView) bindings[2]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[5]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            );
        this.cardContent.setTag(null);
        this.ivPlace.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvPlaceDesc.setTag(null);
        this.tvPlaceName.setTag(null);
        this.tvTalukName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
                return onChangeViewModelPlaceDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPlaceName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelTalukName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelPlaceDescription(androidx.databinding.ObservableField<java.lang.String> ViewModelPlaceDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlaceName(androidx.databinding.ObservableField<java.lang.String> ViewModelPlaceName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTalukName(androidx.databinding.ObservableField<java.lang.String> ViewModelTalukName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String commonUtilsToHtmlViewModelPlaceDescription = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPlaceDescription = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPlaceName = null;
        java.lang.String viewModelPlaceDescriptionGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTalukName = null;
        java.lang.String viewModelPlaceNameGet = null;
        java.lang.String viewModelTalukNameGet = null;
        java.lang.String viewModelImageUrlGet = null;
        application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapterViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

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
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.placeDescription
                        viewModelPlaceDescription = viewModel.placeDescription;
                    }
                    updateRegistration(1, viewModelPlaceDescription);


                    if (viewModelPlaceDescription != null) {
                        // read viewModel.placeDescription.get()
                        viewModelPlaceDescriptionGet = viewModelPlaceDescription.get();
                    }


                    // read CommonUtils.toHtml(viewModel.placeDescription.get())
                    commonUtilsToHtmlViewModelPlaceDescription = application.haveri.tourism.utils.CommonUtils.toHtml(viewModelPlaceDescriptionGet);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.placeName
                        viewModelPlaceName = viewModel.placeName;
                    }
                    updateRegistration(2, viewModelPlaceName);


                    if (viewModelPlaceName != null) {
                        // read viewModel.placeName.get()
                        viewModelPlaceNameGet = viewModelPlaceName.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.talukName
                        viewModelTalukName = viewModel.talukName;
                    }
                    updateRegistration(3, viewModelTalukName);


                    if (viewModelTalukName != null) {
                        // read viewModel.talukName.get()
                        viewModelTalukNameGet = viewModelTalukName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageUrl(this.ivPlace, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPlaceDesc, commonUtilsToHtmlViewModelPlaceDescription);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPlaceName, viewModelPlaceNameGet);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTalukName, viewModelTalukNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapterViewModel viewModel = mViewModel;
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
        flag 1 (0x2L): viewModel.placeDescription
        flag 2 (0x3L): viewModel.placeName
        flag 3 (0x4L): viewModel.talukName
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}