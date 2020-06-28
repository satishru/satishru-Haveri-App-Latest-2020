package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFullscreenImageBindingImpl extends LayoutFullscreenImageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_place_holder, 3);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFullscreenImageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutFullscreenImageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (application.haveri.tourism.ui.custom.TouchImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[2]
            );
        this.ivImage.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvImageDesc.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.imageObj == variableId) {
            setImageObj((application.haveri.tourism.data.model.api.response.haveri_data.Images) variable);
        }
        else if (BR.selectedLanguage == variableId) {
            setSelectedLanguage((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImageObj(@Nullable application.haveri.tourism.data.model.api.response.haveri_data.Images ImageObj) {
        this.mImageObj = ImageObj;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imageObj);
        super.requestRebind();
    }
    public void setSelectedLanguage(@Nullable java.lang.Integer SelectedLanguage) {
        this.mSelectedLanguage = SelectedLanguage;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.selectedLanguage);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxSelectedLanguage = 0;
        application.haveri.tourism.data.model.api.response.haveri_data.Images imageObj = mImageObj;
        java.lang.String imageObjImageUrl = null;
        java.lang.Integer selectedLanguage = mSelectedLanguage;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (imageObj != null) {
                        // read imageObj.imageUrl
                        imageObjImageUrl = imageObj.getImageUrl();
                    }
            }

                // read androidx.databinding.ViewDataBinding.safeUnbox(selectedLanguage)
                androidxDatabindingViewDataBindingSafeUnboxSelectedLanguage = androidx.databinding.ViewDataBinding.safeUnbox(selectedLanguage);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageFullUrl(this.ivImage, imageObjImageUrl);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageText(this.tvImageDesc, imageObj, androidxDatabindingViewDataBindingSafeUnboxSelectedLanguage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imageObj
        flag 1 (0x2L): selectedLanguage
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}