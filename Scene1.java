package com.biplug.hidoraeasy3.activity;

import android.os.Bundle;
import com.biplug.android.block.ui.ButtonBlock;
import com.biplug.android.block.ui.EditTextBlock;
import com.biplug.android.block.ui.LabelBlock;
import com.biplug.android.block.ui.NetworkImageBlock;
import com.biplug.android.block.ui.UiBlock;

// 이 아래에 필요한 패키지를 추가하세요.


public class Scene1 extends BiplugScene {
    
    // 이미지, 라벨, 텍스트, 버튼 블록 변수 생성
    private NetworkImageBlock mNetworkImageBlockUiId1511831288085;
    private LabelBlock mLabelBlockUiId1511831287960;
    private EditTextBlock mEditTextBlockUiId1511831288096;
    private ButtonBlock mButtonBlockUiId1511831288129;
    
    // TODO: 이 아래에 필요한 변수를 입력하세요.
    
    
    /*
     * initialization for Scene1
     */
    @Override
    protected void onPostInitialized(Bundle savedInstanceState) {
        mLabelBlockUiId1511831287960 = mBlockManager.getUiBlock("ui-id-1511831287960");
        mNetworkImageBlockUiId1511831288085 = mBlockManager.getUiBlock("ui-id-1511831288085");
        mEditTextBlockUiId1511831288096 = mBlockManager.getUiBlock("ui-id-1511831288096");
        mButtonBlockUiId1511831288129 = mBlockManager.getUiBlock("ui-id-1511831288129");
        
        // TODO: 이 아래에 임의의 값을 저장하는 코드를 입력하세요.
        
    }
    
    @Override
    public boolean onUiBlockClick(UiBlock uiBlock) {
        // TODO: 이 아래에 버튼을 클릭했을 때 실행할 코드를 입력하세요.
        
    }
}
