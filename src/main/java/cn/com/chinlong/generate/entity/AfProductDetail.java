package cn.com.chinlong.generate.entity;

import java.lang.Long;
import java.math.BigDecimal;
/**
 * AF商品情報詳細マスタ
 * @author ChinLong
 */
public class AfProductDetail {
	/** 現法コード */
	private String subsidiaryCd ;
	/** インナーコード */
	private String innerCd ;
	/** カテゴリ名 */
	private String categoryName ;
	/** 商品カテゴリコード */
	private String categoryCd ;
	/** 組み合わせカテゴリコード */
	private String combiCategoryCd ;
	/** ブランドコード略称 */
	private String brandCd ;
	/** 型番（型式） */
	private String fullProductCd ;
	/** 基本形状型番 */
	private String baseProductCd ;
	/** 商品名（現地語） */
	private String ntvProductName ;
	/** 商品説明 */
	private String productManual ;
	/** シリーズ */
	private String series ;
	/** タイプ */
	private String type ;
	/** 表面処理 */
	private String surfaceFinish ;
	/** カタログ納期 */
	private String catalogDays ;
	/** 溝列数 */
	private String fluteColumn ;
	/** 溝面数 */
	private String fluteSurface ;
	/** 角数 */
	private String edgeNum ;
	/** 色 */
	private String color ;
	/** 重量 */
	private BigDecimal weight ;
	/** 断面積 */
	private BigDecimal sectionalArea ;
	/** 許容荷重 */
	private BigDecimal allowableLoad ;
	/** 車輪材質 */
	private String wheelMaterial ;
	/** 車輪外径(φ) */
	private String wheelOutDiameter ;
	/** 仕入先コード */
	private String supplierCd ;
	/** Qランク区分 */
	private String qRankDiv ;
	/** 対応パネル板厚(mm) */
	private String panelThickness ;
	/** 角度 */
	private String angle ;
	/** 異種、異形フラグ */
	private String diffShapeFlg ;
	/** 基準フレーム幅(mm) */
	private BigDecimal baseFrameWidth ;
	/** 追加工有無フラグ */
	private String addProcFlg ;
	/** ブラケットC穴可否 */
	private String blacketCHole ;
	/** 断面2次モーメント（lx) ×10^4 */
	private BigDecimal momentLx ;
	/** 断面2次モーメント（ly) ×10^4 */
	private BigDecimal momentLy ;
	/** 縦弾性係数[N/mm^2] */
	private BigDecimal youngsModulus ;
	/** 適応シリーズ */
	private String adaptSeries ;
	/** 適応角数 */
	private String adaptEdgeNum ;
	/** 締結可能最大数 */
	private String jointLimit ;
	/** 適合M径 */
	private String fitMDiameter ;
	/** 適合ボルト長(mm) */
	private String fitBoltSize ;
	/** 適合ボルト種類 */
	private String fitBoltKind ;
	/** 取付方法（固定方式） */
	private String fixMethod ;
	/** 材質 */
	private String material ;
	/** 電源単相ボルト */
	private String powerSingleBolt ;
	/** 風量(m^3/min) */
	private BigDecimal airVolume ;
	/** 商品URL(シリーズコード) */
	private String productUrl ;
	/** ゲストユーザFG */
	private String userFlg ;
	/** 板厚（厚み）(mm) */
	private String boardThickness ;
	/** サイズ最大(mm) */
	private String maxSize ;
	/** サイズ最小(mm) */
	private String minSize ;
	/** サイズピッチ(mm) */
	private BigDecimal pitchSize ;
	/** 固定長販売フラグ */
	private String fixLenSales ;
	/** 溝位置左 */
	private BigDecimal fluteLeft ;
	/** 溝位置右 */
	private BigDecimal fluteRight ;
	/** 溝位置上 */
	private BigDecimal fluteUp ;
	/** 溝位置下 */
	private BigDecimal fluteDown ;
	/** 溝ピッチ左 */
	private String flutePitchLeft ;
	/** 溝ピッチ右 */
	private String flutePitchRight ;
	/** 溝ピッチ上 */
	private String flutePitchUp ;
	/** 溝ピッチ下 */
	private String flutePitchDown ;
	/** フラット面位置 */
	private String flatPos ;
	/** 形状（断面形状） */
	private String shape ;
	/** クロス対応可否 */
	private String crossFeasibility ;
	/** 対称形状(XY面) */
	private String symmetryXy ;
	/** 対称形状(Z面(左右)) */
	private String symmetryZ ;
	/** X面突起有無 */
	private String protuberanceX ;
	/** Y面突起有無 */
	private String protuberanceY ;
	/** 締結位置(内側/外側) */
	private String jointPos ;
	/** 対応締結パターン */
	private String jointPattern ;
	/** 必須溝フレーム位置 */
	private String essentialFlutePos ;
	/** 主体/副体 */
	private String coreSide ;
	/** 締結可能商品カテゴリコード */
	private String jointOkCategoryCd ;
	/** 左シリーズ：角数 */
	private String seriesLeftEdge ;
	/** 右シリーズ：角数 */
	private String seriesRightEdge ;
	/** 勝手(左右) */
	private String hingeLr ;
	/** 穴位置1(X,Y,Z) */
	private String holePos1 ;
	/** 穴向き1(X,Y,Z) */
	private String holeCourse1 ;
	/** 穴深さ1 */
	private BigDecimal holeDepth1 ;
	/** 適合ボルト1 */
	private String fitBolt1 ;
	/** 適合ナット1 */
	private String fitNut1 ;
	/** 適合ボルト種類1 */
	private String fitBoltKind1 ;
	/** 穴種類1 */
	private String holeKind1 ;
	/** 穴径1 */
	private String holeDiameter1 ;
	/** 付属品区分1 */
	private String accessory1 ;
	/** 穴位置2(X,Y,Z) */
	private String holePos2 ;
	/** 穴向き2(X,Y,Z) */
	private String holeCourse2 ;
	/** 穴深さ2 */
	private BigDecimal holeDepth2 ;
	/** 適合ボルト2 */
	private String fitBolt2 ;
	/** 適合ナット2 */
	private String fitNut2 ;
	/** 適合ボルト種類2 */
	private String fitBoltKind2 ;
	/** 穴種類2 */
	private String holeKind2 ;
	/** 穴径2 */
	private String holeDiameter2 ;
	/** 付属品区分2 */
	private String accessory2 ;
	/** 穴位置3(X,Y,Z) */
	private String holePos3 ;
	/** 穴向き3(X,Y,Z) */
	private String holeCourse3 ;
	/** 穴深さ3 */
	private BigDecimal holeDepth3 ;
	/** 適合ボルト3 */
	private String fitBolt3 ;
	/** 適合ナット3 */
	private String fitNut3 ;
	/** 適合ボルト種類3 */
	private String fitBoltKind3 ;
	/** 穴種類3 */
	private String holeKind3 ;
	/** 穴径3 */
	private String holeDiameter3 ;
	/** 付属品区分3 */
	private String accessory3 ;
	/** 穴位置4(X,Y,Z) */
	private String holePos4 ;
	/** 穴向き4(X,Y,Z) */
	private String holeCourse4 ;
	/** 穴深さ4 */
	private BigDecimal holeDepth4 ;
	/** 適合ボルト4 */
	private String fitBolt4 ;
	/** 適合ナット4 */
	private String fitNut4 ;
	/** 適合ボルト種類4 */
	private String fitBoltKind4 ;
	/** 穴種類4 */
	private String holeKind4 ;
	/** 穴径4 */
	private String holeDiameter4 ;
	/** 付属品区分4 */
	private String accessory4 ;
	/** 穴位置5(X,Y,Z) */
	private String holePos5 ;
	/** 穴向き5(X,Y,Z) */
	private String holeCourse5 ;
	/** 穴深さ5 */
	private BigDecimal holeDepth5 ;
	/** 適合ボルト5 */
	private String fitBolt5 ;
	/** 適合ナット5 */
	private String fitNut5 ;
	/** 適合ボルト種類5 */
	private String fitBoltKind5 ;
	/** 穴種類5 */
	private String holeKind5 ;
	/** 穴径5 */
	private String holeDiameter5 ;
	/** 付属品区分5 */
	private String accessory5 ;
	/** 穴位置6(X,Y,Z) */
	private String holePos6 ;
	/** 穴向き6(X,Y,Z) */
	private String holeCourse6 ;
	/** 穴深さ6 */
	private BigDecimal holeDepth6 ;
	/** 適合ボルト6 */
	private String fitBolt6 ;
	/** 適合ナット6 */
	private String fitNut6 ;
	/** 適合ボルト種類6 */
	private String fitBoltKind6 ;
	/** 穴種類6 */
	private String holeKind6 ;
	/** 穴径6 */
	private String holeDiameter6 ;
	/** 付属品区分6 */
	private String accessory6 ;
	/** 穴位置7(X,Y,Z) */
	private String holePos7 ;
	/** 穴向き7(X,Y,Z) */
	private String holeCourse7 ;
	/** 穴深さ7 */
	private BigDecimal holeDepth7 ;
	/** 適合ボルト7 */
	private String fitBolt7 ;
	/** 適合ナット7 */
	private String fitNut7 ;
	/** 適合ボルト種類7 */
	private String fitBoltKind7 ;
	/** 穴種類7 */
	private String holeKind7 ;
	/** 穴径7 */
	private String holeDiameter7 ;
	/** 付属品区分7 */
	private String accessory7 ;
	/** 穴位置8(X,Y,Z) */
	private String holePos8 ;
	/** 穴向き8(X,Y,Z) */
	private String holeCourse8 ;
	/** 穴深さ8 */
	private BigDecimal holeDepth8 ;
	/** 適合ボルト8 */
	private String fitBolt8 ;
	/** 適合ナット8 */
	private String fitNut8 ;
	/** 適合ボルト種類8 */
	private String fitBoltKind8 ;
	/** 穴種類8 */
	private String holeKind8 ;
	/** 穴径8 */
	private String holeDiameter8 ;
	/** 付属品区分8 */
	private String accessory8 ;
	/** 穴位置9(X,Y,Z) */
	private String holePos9 ;
	/** 穴向き9(X,Y,Z) */
	private String holeCourse9 ;
	/** 穴深さ9 */
	private BigDecimal holeDepth9 ;
	/** 適合ボルト9 */
	private String fitBolt9 ;
	/** 適合ナット9 */
	private String fitNut9 ;
	/** 適合ボルト種類9 */
	private String fitBoltKind9 ;
	/** 穴種類9 */
	private String holeKind9 ;
	/** 穴径9 */
	private String holeDiameter9 ;
	/** 付属品区分9 */
	private String accessory9 ;
	/** 穴位置10(X,Y,Z) */
	private String holePos10 ;
	/** 穴向き10(X,Y,Z) */
	private String holeCourse10 ;
	/** 穴深さ10 */
	private BigDecimal holeDepth10 ;
	/** 適合ボルト10 */
	private String fitBolt10 ;
	/** 適合ナット10 */
	private String fitNut10 ;
	/** 適合ボルト種類10 */
	private String fitBoltKind10 ;
	/** 穴種類10 */
	private String holeKind10 ;
	/** 穴径10 */
	private String holeDiameter10 ;
	/** 付属品区分10 */
	private String accessory10 ;
	/** 穴位置11(X,Y,Z) */
	private String holePos11 ;
	/** 穴向き11(X,Y,Z) */
	private String holeCourse11 ;
	/** 穴深さ11 */
	private BigDecimal holeDepth11 ;
	/** 適合ボルト11 */
	private String fitBolt11 ;
	/** 適合ナット11 */
	private String fitNut11 ;
	/** 適合ボルト種類11 */
	private String fitBoltKind11 ;
	/** 穴種類11 */
	private String holeKind11 ;
	/** 穴径11 */
	private String holeDiameter11 ;
	/** 付属品区分11 */
	private String accessory11 ;
	/** 穴位置12(X,Y,Z) */
	private String holePos12 ;
	/** 穴向き12(X,Y,Z) */
	private String holeCourse12 ;
	/** 穴深さ12 */
	private BigDecimal holeDepth12 ;
	/** 適合ボルト12 */
	private String fitBolt12 ;
	/** 適合ナット12 */
	private String fitNut12 ;
	/** 適合ボルト種類12 */
	private String fitBoltKind12 ;
	/** 穴種類12 */
	private String holeKind12 ;
	/** 穴径12 */
	private String holeDiameter12 ;
	/** 付属品区分12 */
	private String accessory12 ;
	/** 穴位置13(X,Y,Z) */
	private String holePos13 ;
	/** 穴向き13(X,Y,Z) */
	private String holeCourse13 ;
	/** 穴深さ13 */
	private BigDecimal holeDepth13 ;
	/** 適合ボルト13 */
	private String fitBolt13 ;
	/** 適合ナット13 */
	private String fitNut13 ;
	/** 適合ボルト種類13 */
	private String fitBoltKind13 ;
	/** 穴種類13 */
	private String holeKind13 ;
	/** 穴径13 */
	private String holeDiameter13 ;
	/** 付属品区分13 */
	private String accessory13 ;
	/** 穴位置14(X,Y,Z) */
	private String holePos14 ;
	/** 穴向き14(X,Y,Z) */
	private String holeCourse14 ;
	/** 穴深さ14 */
	private BigDecimal holeDepth14 ;
	/** 適合ボルト14 */
	private String fitBolt14 ;
	/** 適合ナット14 */
	private String fitNut14 ;
	/** 適合ボルト種類14 */
	private String fitBoltKind14 ;
	/** 穴種類14 */
	private String holeKind14 ;
	/** 穴径14 */
	private String holeDiameter14 ;
	/** 付属品区分14 */
	private String accessory14 ;
	/** 穴位置15(X,Y,Z) */
	private String holePos15 ;
	/** 穴向き15(X,Y,Z) */
	private String holeCourse15 ;
	/** 穴深さ15 */
	private BigDecimal holeDepth15 ;
	/** 適合ボルト15 */
	private String fitBolt15 ;
	/** 適合ナット15 */
	private String fitNut15 ;
	/** 適合ボルト種類15 */
	private String fitBoltKind15 ;
	/** 穴種類15 */
	private String holeKind15 ;
	/** 穴径15 */
	private String holeDiameter15 ;
	/** 付属品区分15 */
	private String accessory15 ;
	/** 穴位置16(X,Y,Z) */
	private String holePos16 ;
	/** 穴向き16(X,Y,Z) */
	private String holeCourse16 ;
	/** 穴深さ16 */
	private BigDecimal holeDepth16 ;
	/** 適合ボルト16 */
	private String fitBolt16 ;
	/** 適合ナット16 */
	private String fitNut16 ;
	/** 適合ボルト種類16 */
	private String fitBoltKind16 ;
	/** 穴種類16 */
	private String holeKind16 ;
	/** 穴径16 */
	private String holeDiameter16 ;
	/** 付属品区分16 */
	private String accessory16 ;
	/** 穴位置17(X,Y,Z) */
	private String holePos17 ;
	/** 穴向き17(X,Y,Z) */
	private String holeCourse17 ;
	/** 穴深さ17 */
	private BigDecimal holeDepth17 ;
	/** 適合ボルト17 */
	private String fitBolt17 ;
	/** 適合ナット17 */
	private String fitNut17 ;
	/** 適合ボルト種類17 */
	private String fitBoltKind17 ;
	/** 穴種類17 */
	private String holeKind17 ;
	/** 穴径17 */
	private String holeDiameter17 ;
	/** 付属品区分17 */
	private String accessory17 ;
	/** 穴位置18(X,Y,Z) */
	private String holePos18 ;
	/** 穴向き18(X,Y,Z) */
	private String holeCourse18 ;
	/** 穴深さ18 */
	private BigDecimal holeDepth18 ;
	/** 適合ボルト18 */
	private String fitBolt18 ;
	/** 適合ナット18 */
	private String fitNut18 ;
	/** 適合ボルト種類18 */
	private String fitBoltKind18 ;
	/** 穴種類18 */
	private String holeKind18 ;
	/** 穴径18 */
	private String holeDiameter18 ;
	/** 付属品区分18 */
	private String accessory18 ;
	/** 追加工禁止領域 */
	private String addProcNgArea ;
	/** 対応フレーム */
	private String correspondFrame ;
	/** ストークＴ売単価 */
	private String storkTSUnitPrice ;
	/** ストークＴ仕入単価 */
	private String storkTPUnitPrice ;
	/** ストークＴカタログ納期 */
	private String storkTCatalogDays ;
	/** ストークＡ売単価 */
	private String storkASUnitPrice ;
	/** ストークＡ仕入単価 */
	private String storkAPUnitPrice ;
	/** ストークＡカタログ納期 */
	private String storkACatalogDays ;
	/** ストークＢ売単価 */
	private String storkBSUnitPrice ;
	/** ストークＢ仕入単価 */
	private String storkBPUnitPrice ;
	/** ストークＢカタログ納期 */
	private String storkBCatalogDays ;
	/** ストークＣ売単価 */
	private String storkCSUnitPrice ;
	/** ストークＣ仕入単価 */
	private String storkCPUnitPrice ;
	/** ストークＣカタログ納期 */
	private String storkCCatalogDays ;
	/** タブコード */
	private String afReserve01 ;
	/** 予備2 */
	private String afReserve02 ;
	/** 予備3 */
	private String afReserve03 ;
	/** 予備4 */
	private String afReserve04 ;
	/** 予備5 */
	private String afReserve05 ;
	/** 予備6 */
	private String afReserve06 ;
	/** 予備7 */
	private String afReserve07 ;
	/** 予備8 */
	private String afReserve08 ;
	/** 予備9 */
	private String afReserve09 ;
	/** 予備10 */
	private String afReserve10 ;
	/** 新商品(おすすめ)FG */
	private String recommendFlg ;
	/** 取り扱いなし理由 */
	private String stockoutReason ;
	/** 更新管理No */
	private Long updateNo ;
	/** 削除フラグ */
	private String delFlg ;
	/** 更新ユーザID */
	private String updateUserId ;
	/** 登録日時（システム日時） */
	private String regSysTime ;
	/** 更新日時（システム日時） */
	private String updSysTime ;
	
	/**
	 *方法: 取得subsidiaryCd
	 *@return: subsidiaryCd  現法コード
	 */
	
	public String getSubsidiaryCd(){
		return this.subsidiaryCd;
	}

	/**
	 *方法: 设置subsidiaryCd
	 *@param: subsidiaryCd  現法コード
	 */
	public void setSubsidiaryCd(String subsidiaryCd){
		this.subsidiaryCd = subsidiaryCd;
	}
	/**
	 *方法: 取得innerCd
	 *@return: innerCd  インナーコード
	 */
	
	public String getInnerCd(){
		return this.innerCd;
	}

	/**
	 *方法: 设置innerCd
	 *@param: innerCd  インナーコード
	 */
	public void setInnerCd(String innerCd){
		this.innerCd = innerCd;
	}
	/**
	 *方法: 取得categoryName
	 *@return: categoryName  カテゴリ名
	 */
	
	public String getCategoryName(){
		return this.categoryName;
	}

	/**
	 *方法: 设置categoryName
	 *@param: categoryName  カテゴリ名
	 */
	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}
	/**
	 *方法: 取得categoryCd
	 *@return: categoryCd  商品カテゴリコード
	 */
	
	public String getCategoryCd(){
		return this.categoryCd;
	}

	/**
	 *方法: 设置categoryCd
	 *@param: categoryCd  商品カテゴリコード
	 */
	public void setCategoryCd(String categoryCd){
		this.categoryCd = categoryCd;
	}
	/**
	 *方法: 取得combiCategoryCd
	 *@return: combiCategoryCd  組み合わせカテゴリコード
	 */
	
	public String getCombiCategoryCd(){
		return this.combiCategoryCd;
	}

	/**
	 *方法: 设置combiCategoryCd
	 *@param: combiCategoryCd  組み合わせカテゴリコード
	 */
	public void setCombiCategoryCd(String combiCategoryCd){
		this.combiCategoryCd = combiCategoryCd;
	}
	/**
	 *方法: 取得brandCd
	 *@return: brandCd  ブランドコード略称
	 */
	
	public String getBrandCd(){
		return this.brandCd;
	}

	/**
	 *方法: 设置brandCd
	 *@param: brandCd  ブランドコード略称
	 */
	public void setBrandCd(String brandCd){
		this.brandCd = brandCd;
	}
	/**
	 *方法: 取得fullProductCd
	 *@return: fullProductCd  型番（型式）
	 */
	
	public String getFullProductCd(){
		return this.fullProductCd;
	}

	/**
	 *方法: 设置fullProductCd
	 *@param: fullProductCd  型番（型式）
	 */
	public void setFullProductCd(String fullProductCd){
		this.fullProductCd = fullProductCd;
	}
	/**
	 *方法: 取得baseProductCd
	 *@return: baseProductCd  基本形状型番
	 */
	
	public String getBaseProductCd(){
		return this.baseProductCd;
	}

	/**
	 *方法: 设置baseProductCd
	 *@param: baseProductCd  基本形状型番
	 */
	public void setBaseProductCd(String baseProductCd){
		this.baseProductCd = baseProductCd;
	}
	/**
	 *方法: 取得ntvProductName
	 *@return: ntvProductName  商品名（現地語）
	 */
	
	public String getNtvProductName(){
		return this.ntvProductName;
	}

	/**
	 *方法: 设置ntvProductName
	 *@param: ntvProductName  商品名（現地語）
	 */
	public void setNtvProductName(String ntvProductName){
		this.ntvProductName = ntvProductName;
	}
	/**
	 *方法: 取得productManual
	 *@return: productManual  商品説明
	 */
	
	public String getProductManual(){
		return this.productManual;
	}

	/**
	 *方法: 设置productManual
	 *@param: productManual  商品説明
	 */
	public void setProductManual(String productManual){
		this.productManual = productManual;
	}
	/**
	 *方法: 取得series
	 *@return: series  シリーズ
	 */
	
	public String getSeries(){
		return this.series;
	}

	/**
	 *方法: 设置series
	 *@param: series  シリーズ
	 */
	public void setSeries(String series){
		this.series = series;
	}
	/**
	 *方法: 取得type
	 *@return: type  タイプ
	 */
	
	public String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: type  タイプ
	 */
	public void setType(String type){
		this.type = type;
	}
	/**
	 *方法: 取得surfaceFinish
	 *@return: surfaceFinish  表面処理
	 */
	
	public String getSurfaceFinish(){
		return this.surfaceFinish;
	}

	/**
	 *方法: 设置surfaceFinish
	 *@param: surfaceFinish  表面処理
	 */
	public void setSurfaceFinish(String surfaceFinish){
		this.surfaceFinish = surfaceFinish;
	}
	/**
	 *方法: 取得catalogDays
	 *@return: catalogDays  カタログ納期
	 */
	
	public String getCatalogDays(){
		return this.catalogDays;
	}

	/**
	 *方法: 设置catalogDays
	 *@param: catalogDays  カタログ納期
	 */
	public void setCatalogDays(String catalogDays){
		this.catalogDays = catalogDays;
	}
	/**
	 *方法: 取得fluteColumn
	 *@return: fluteColumn  溝列数
	 */
	
	public String getFluteColumn(){
		return this.fluteColumn;
	}

	/**
	 *方法: 设置fluteColumn
	 *@param: fluteColumn  溝列数
	 */
	public void setFluteColumn(String fluteColumn){
		this.fluteColumn = fluteColumn;
	}
	/**
	 *方法: 取得fluteSurface
	 *@return: fluteSurface  溝面数
	 */
	
	public String getFluteSurface(){
		return this.fluteSurface;
	}

	/**
	 *方法: 设置fluteSurface
	 *@param: fluteSurface  溝面数
	 */
	public void setFluteSurface(String fluteSurface){
		this.fluteSurface = fluteSurface;
	}
	/**
	 *方法: 取得edgeNum
	 *@return: edgeNum  角数
	 */
	
	public String getEdgeNum(){
		return this.edgeNum;
	}

	/**
	 *方法: 设置edgeNum
	 *@param: edgeNum  角数
	 */
	public void setEdgeNum(String edgeNum){
		this.edgeNum = edgeNum;
	}
	/**
	 *方法: 取得color
	 *@return: color  色
	 */
	
	public String getColor(){
		return this.color;
	}

	/**
	 *方法: 设置color
	 *@param: color  色
	 */
	public void setColor(String color){
		this.color = color;
	}
	/**
	 *方法: 取得weight
	 *@return: weight  重量
	 */
	
	public BigDecimal getWeight(){
		return this.weight;
	}

	/**
	 *方法: 设置weight
	 *@param: weight  重量
	 */
	public void setWeight(BigDecimal weight){
		this.weight = weight;
	}
	/**
	 *方法: 取得sectionalArea
	 *@return: sectionalArea  断面積
	 */
	
	public BigDecimal getSectionalArea(){
		return this.sectionalArea;
	}

	/**
	 *方法: 设置sectionalArea
	 *@param: sectionalArea  断面積
	 */
	public void setSectionalArea(BigDecimal sectionalArea){
		this.sectionalArea = sectionalArea;
	}
	/**
	 *方法: 取得allowableLoad
	 *@return: allowableLoad  許容荷重
	 */
	
	public BigDecimal getAllowableLoad(){
		return this.allowableLoad;
	}

	/**
	 *方法: 设置allowableLoad
	 *@param: allowableLoad  許容荷重
	 */
	public void setAllowableLoad(BigDecimal allowableLoad){
		this.allowableLoad = allowableLoad;
	}
	/**
	 *方法: 取得wheelMaterial
	 *@return: wheelMaterial  車輪材質
	 */
	
	public String getWheelMaterial(){
		return this.wheelMaterial;
	}

	/**
	 *方法: 设置wheelMaterial
	 *@param: wheelMaterial  車輪材質
	 */
	public void setWheelMaterial(String wheelMaterial){
		this.wheelMaterial = wheelMaterial;
	}
	/**
	 *方法: 取得wheelOutDiameter
	 *@return: wheelOutDiameter  車輪外径(φ)
	 */
	
	public String getWheelOutDiameter(){
		return this.wheelOutDiameter;
	}

	/**
	 *方法: 设置wheelOutDiameter
	 *@param: wheelOutDiameter  車輪外径(φ)
	 */
	public void setWheelOutDiameter(String wheelOutDiameter){
		this.wheelOutDiameter = wheelOutDiameter;
	}
	/**
	 *方法: 取得supplierCd
	 *@return: supplierCd  仕入先コード
	 */
	
	public String getSupplierCd(){
		return this.supplierCd;
	}

	/**
	 *方法: 设置supplierCd
	 *@param: supplierCd  仕入先コード
	 */
	public void setSupplierCd(String supplierCd){
		this.supplierCd = supplierCd;
	}
	/**
	 *方法: 取得qRankDiv
	 *@return: qRankDiv  Qランク区分
	 */
	
	public String getQRankDiv(){
		return this.qRankDiv;
	}

	/**
	 *方法: 设置qRankDiv
	 *@param: qRankDiv  Qランク区分
	 */
	public void setQRankDiv(String qRankDiv){
		this.qRankDiv = qRankDiv;
	}
	/**
	 *方法: 取得panelThickness
	 *@return: panelThickness  対応パネル板厚(mm)
	 */
	
	public String getPanelThickness(){
		return this.panelThickness;
	}

	/**
	 *方法: 设置panelThickness
	 *@param: panelThickness  対応パネル板厚(mm)
	 */
	public void setPanelThickness(String panelThickness){
		this.panelThickness = panelThickness;
	}
	/**
	 *方法: 取得angle
	 *@return: angle  角度
	 */
	
	public String getAngle(){
		return this.angle;
	}

	/**
	 *方法: 设置angle
	 *@param: angle  角度
	 */
	public void setAngle(String angle){
		this.angle = angle;
	}
	/**
	 *方法: 取得diffShapeFlg
	 *@return: diffShapeFlg  異種、異形フラグ
	 */
	
	public String getDiffShapeFlg(){
		return this.diffShapeFlg;
	}

	/**
	 *方法: 设置diffShapeFlg
	 *@param: diffShapeFlg  異種、異形フラグ
	 */
	public void setDiffShapeFlg(String diffShapeFlg){
		this.diffShapeFlg = diffShapeFlg;
	}
	/**
	 *方法: 取得baseFrameWidth
	 *@return: baseFrameWidth  基準フレーム幅(mm)
	 */
	
	public BigDecimal getBaseFrameWidth(){
		return this.baseFrameWidth;
	}

	/**
	 *方法: 设置baseFrameWidth
	 *@param: baseFrameWidth  基準フレーム幅(mm)
	 */
	public void setBaseFrameWidth(BigDecimal baseFrameWidth){
		this.baseFrameWidth = baseFrameWidth;
	}
	/**
	 *方法: 取得addProcFlg
	 *@return: addProcFlg  追加工有無フラグ
	 */
	
	public String getAddProcFlg(){
		return this.addProcFlg;
	}

	/**
	 *方法: 设置addProcFlg
	 *@param: addProcFlg  追加工有無フラグ
	 */
	public void setAddProcFlg(String addProcFlg){
		this.addProcFlg = addProcFlg;
	}
	/**
	 *方法: 取得blacketCHole
	 *@return: blacketCHole  ブラケットC穴可否
	 */
	
	public String getBlacketCHole(){
		return this.blacketCHole;
	}

	/**
	 *方法: 设置blacketCHole
	 *@param: blacketCHole  ブラケットC穴可否
	 */
	public void setBlacketCHole(String blacketCHole){
		this.blacketCHole = blacketCHole;
	}
	/**
	 *方法: 取得momentLx
	 *@return: momentLx  断面2次モーメント（lx) ×10^4
	 */
	
	public BigDecimal getMomentLx(){
		return this.momentLx;
	}

	/**
	 *方法: 设置momentLx
	 *@param: momentLx  断面2次モーメント（lx) ×10^4
	 */
	public void setMomentLx(BigDecimal momentLx){
		this.momentLx = momentLx;
	}
	/**
	 *方法: 取得momentLy
	 *@return: momentLy  断面2次モーメント（ly) ×10^4
	 */
	
	public BigDecimal getMomentLy(){
		return this.momentLy;
	}

	/**
	 *方法: 设置momentLy
	 *@param: momentLy  断面2次モーメント（ly) ×10^4
	 */
	public void setMomentLy(BigDecimal momentLy){
		this.momentLy = momentLy;
	}
	/**
	 *方法: 取得youngsModulus
	 *@return: youngsModulus  縦弾性係数[N/mm^2]
	 */
	
	public BigDecimal getYoungsModulus(){
		return this.youngsModulus;
	}

	/**
	 *方法: 设置youngsModulus
	 *@param: youngsModulus  縦弾性係数[N/mm^2]
	 */
	public void setYoungsModulus(BigDecimal youngsModulus){
		this.youngsModulus = youngsModulus;
	}
	/**
	 *方法: 取得adaptSeries
	 *@return: adaptSeries  適応シリーズ
	 */
	
	public String getAdaptSeries(){
		return this.adaptSeries;
	}

	/**
	 *方法: 设置adaptSeries
	 *@param: adaptSeries  適応シリーズ
	 */
	public void setAdaptSeries(String adaptSeries){
		this.adaptSeries = adaptSeries;
	}
	/**
	 *方法: 取得adaptEdgeNum
	 *@return: adaptEdgeNum  適応角数
	 */
	
	public String getAdaptEdgeNum(){
		return this.adaptEdgeNum;
	}

	/**
	 *方法: 设置adaptEdgeNum
	 *@param: adaptEdgeNum  適応角数
	 */
	public void setAdaptEdgeNum(String adaptEdgeNum){
		this.adaptEdgeNum = adaptEdgeNum;
	}
	/**
	 *方法: 取得jointLimit
	 *@return: jointLimit  締結可能最大数
	 */
	
	public String getJointLimit(){
		return this.jointLimit;
	}

	/**
	 *方法: 设置jointLimit
	 *@param: jointLimit  締結可能最大数
	 */
	public void setJointLimit(String jointLimit){
		this.jointLimit = jointLimit;
	}
	/**
	 *方法: 取得fitMDiameter
	 *@return: fitMDiameter  適合M径
	 */
	
	public String getFitMDiameter(){
		return this.fitMDiameter;
	}

	/**
	 *方法: 设置fitMDiameter
	 *@param: fitMDiameter  適合M径
	 */
	public void setFitMDiameter(String fitMDiameter){
		this.fitMDiameter = fitMDiameter;
	}
	/**
	 *方法: 取得fitBoltSize
	 *@return: fitBoltSize  適合ボルト長(mm)
	 */
	
	public String getFitBoltSize(){
		return this.fitBoltSize;
	}

	/**
	 *方法: 设置fitBoltSize
	 *@param: fitBoltSize  適合ボルト長(mm)
	 */
	public void setFitBoltSize(String fitBoltSize){
		this.fitBoltSize = fitBoltSize;
	}
	/**
	 *方法: 取得fitBoltKind
	 *@return: fitBoltKind  適合ボルト種類
	 */
	
	public String getFitBoltKind(){
		return this.fitBoltKind;
	}

	/**
	 *方法: 设置fitBoltKind
	 *@param: fitBoltKind  適合ボルト種類
	 */
	public void setFitBoltKind(String fitBoltKind){
		this.fitBoltKind = fitBoltKind;
	}
	/**
	 *方法: 取得fixMethod
	 *@return: fixMethod  取付方法（固定方式）
	 */
	
	public String getFixMethod(){
		return this.fixMethod;
	}

	/**
	 *方法: 设置fixMethod
	 *@param: fixMethod  取付方法（固定方式）
	 */
	public void setFixMethod(String fixMethod){
		this.fixMethod = fixMethod;
	}
	/**
	 *方法: 取得material
	 *@return: material  材質
	 */
	
	public String getMaterial(){
		return this.material;
	}

	/**
	 *方法: 设置material
	 *@param: material  材質
	 */
	public void setMaterial(String material){
		this.material = material;
	}
	/**
	 *方法: 取得powerSingleBolt
	 *@return: powerSingleBolt  電源単相ボルト
	 */
	
	public String getPowerSingleBolt(){
		return this.powerSingleBolt;
	}

	/**
	 *方法: 设置powerSingleBolt
	 *@param: powerSingleBolt  電源単相ボルト
	 */
	public void setPowerSingleBolt(String powerSingleBolt){
		this.powerSingleBolt = powerSingleBolt;
	}
	/**
	 *方法: 取得airVolume
	 *@return: airVolume  風量(m^3/min)
	 */
	
	public BigDecimal getAirVolume(){
		return this.airVolume;
	}

	/**
	 *方法: 设置airVolume
	 *@param: airVolume  風量(m^3/min)
	 */
	public void setAirVolume(BigDecimal airVolume){
		this.airVolume = airVolume;
	}
	/**
	 *方法: 取得productUrl
	 *@return: productUrl  商品URL(シリーズコード)
	 */
	
	public String getProductUrl(){
		return this.productUrl;
	}

	/**
	 *方法: 设置productUrl
	 *@param: productUrl  商品URL(シリーズコード)
	 */
	public void setProductUrl(String productUrl){
		this.productUrl = productUrl;
	}
	/**
	 *方法: 取得userFlg
	 *@return: userFlg  ゲストユーザFG
	 */
	
	public String getUserFlg(){
		return this.userFlg;
	}

	/**
	 *方法: 设置userFlg
	 *@param: userFlg  ゲストユーザFG
	 */
	public void setUserFlg(String userFlg){
		this.userFlg = userFlg;
	}
	/**
	 *方法: 取得boardThickness
	 *@return: boardThickness  板厚（厚み）(mm)
	 */
	
	public String getBoardThickness(){
		return this.boardThickness;
	}

	/**
	 *方法: 设置boardThickness
	 *@param: boardThickness  板厚（厚み）(mm)
	 */
	public void setBoardThickness(String boardThickness){
		this.boardThickness = boardThickness;
	}
	/**
	 *方法: 取得maxSize
	 *@return: maxSize  サイズ最大(mm)
	 */
	
	public String getMaxSize(){
		return this.maxSize;
	}

	/**
	 *方法: 设置maxSize
	 *@param: maxSize  サイズ最大(mm)
	 */
	public void setMaxSize(String maxSize){
		this.maxSize = maxSize;
	}
	/**
	 *方法: 取得minSize
	 *@return: minSize  サイズ最小(mm)
	 */
	
	public String getMinSize(){
		return this.minSize;
	}

	/**
	 *方法: 设置minSize
	 *@param: minSize  サイズ最小(mm)
	 */
	public void setMinSize(String minSize){
		this.minSize = minSize;
	}
	/**
	 *方法: 取得pitchSize
	 *@return: pitchSize  サイズピッチ(mm)
	 */
	
	public BigDecimal getPitchSize(){
		return this.pitchSize;
	}

	/**
	 *方法: 设置pitchSize
	 *@param: pitchSize  サイズピッチ(mm)
	 */
	public void setPitchSize(BigDecimal pitchSize){
		this.pitchSize = pitchSize;
	}
	/**
	 *方法: 取得fixLenSales
	 *@return: fixLenSales  固定長販売フラグ
	 */
	
	public String getFixLenSales(){
		return this.fixLenSales;
	}

	/**
	 *方法: 设置fixLenSales
	 *@param: fixLenSales  固定長販売フラグ
	 */
	public void setFixLenSales(String fixLenSales){
		this.fixLenSales = fixLenSales;
	}
	/**
	 *方法: 取得fluteLeft
	 *@return: fluteLeft  溝位置左
	 */
	
	public BigDecimal getFluteLeft(){
		return this.fluteLeft;
	}

	/**
	 *方法: 设置fluteLeft
	 *@param: fluteLeft  溝位置左
	 */
	public void setFluteLeft(BigDecimal fluteLeft){
		this.fluteLeft = fluteLeft;
	}
	/**
	 *方法: 取得fluteRight
	 *@return: fluteRight  溝位置右
	 */
	
	public BigDecimal getFluteRight(){
		return this.fluteRight;
	}

	/**
	 *方法: 设置fluteRight
	 *@param: fluteRight  溝位置右
	 */
	public void setFluteRight(BigDecimal fluteRight){
		this.fluteRight = fluteRight;
	}
	/**
	 *方法: 取得fluteUp
	 *@return: fluteUp  溝位置上
	 */
	
	public BigDecimal getFluteUp(){
		return this.fluteUp;
	}

	/**
	 *方法: 设置fluteUp
	 *@param: fluteUp  溝位置上
	 */
	public void setFluteUp(BigDecimal fluteUp){
		this.fluteUp = fluteUp;
	}
	/**
	 *方法: 取得fluteDown
	 *@return: fluteDown  溝位置下
	 */
	
	public BigDecimal getFluteDown(){
		return this.fluteDown;
	}

	/**
	 *方法: 设置fluteDown
	 *@param: fluteDown  溝位置下
	 */
	public void setFluteDown(BigDecimal fluteDown){
		this.fluteDown = fluteDown;
	}
	/**
	 *方法: 取得flutePitchLeft
	 *@return: flutePitchLeft  溝ピッチ左
	 */
	
	public String getFlutePitchLeft(){
		return this.flutePitchLeft;
	}

	/**
	 *方法: 设置flutePitchLeft
	 *@param: flutePitchLeft  溝ピッチ左
	 */
	public void setFlutePitchLeft(String flutePitchLeft){
		this.flutePitchLeft = flutePitchLeft;
	}
	/**
	 *方法: 取得flutePitchRight
	 *@return: flutePitchRight  溝ピッチ右
	 */
	
	public String getFlutePitchRight(){
		return this.flutePitchRight;
	}

	/**
	 *方法: 设置flutePitchRight
	 *@param: flutePitchRight  溝ピッチ右
	 */
	public void setFlutePitchRight(String flutePitchRight){
		this.flutePitchRight = flutePitchRight;
	}
	/**
	 *方法: 取得flutePitchUp
	 *@return: flutePitchUp  溝ピッチ上
	 */
	
	public String getFlutePitchUp(){
		return this.flutePitchUp;
	}

	/**
	 *方法: 设置flutePitchUp
	 *@param: flutePitchUp  溝ピッチ上
	 */
	public void setFlutePitchUp(String flutePitchUp){
		this.flutePitchUp = flutePitchUp;
	}
	/**
	 *方法: 取得flutePitchDown
	 *@return: flutePitchDown  溝ピッチ下
	 */
	
	public String getFlutePitchDown(){
		return this.flutePitchDown;
	}

	/**
	 *方法: 设置flutePitchDown
	 *@param: flutePitchDown  溝ピッチ下
	 */
	public void setFlutePitchDown(String flutePitchDown){
		this.flutePitchDown = flutePitchDown;
	}
	/**
	 *方法: 取得flatPos
	 *@return: flatPos  フラット面位置
	 */
	
	public String getFlatPos(){
		return this.flatPos;
	}

	/**
	 *方法: 设置flatPos
	 *@param: flatPos  フラット面位置
	 */
	public void setFlatPos(String flatPos){
		this.flatPos = flatPos;
	}
	/**
	 *方法: 取得shape
	 *@return: shape  形状（断面形状）
	 */
	
	public String getShape(){
		return this.shape;
	}

	/**
	 *方法: 设置shape
	 *@param: shape  形状（断面形状）
	 */
	public void setShape(String shape){
		this.shape = shape;
	}
	/**
	 *方法: 取得crossFeasibility
	 *@return: crossFeasibility  クロス対応可否
	 */
	
	public String getCrossFeasibility(){
		return this.crossFeasibility;
	}

	/**
	 *方法: 设置crossFeasibility
	 *@param: crossFeasibility  クロス対応可否
	 */
	public void setCrossFeasibility(String crossFeasibility){
		this.crossFeasibility = crossFeasibility;
	}
	/**
	 *方法: 取得symmetryXy
	 *@return: symmetryXy  対称形状(XY面)
	 */
	
	public String getSymmetryXy(){
		return this.symmetryXy;
	}

	/**
	 *方法: 设置symmetryXy
	 *@param: symmetryXy  対称形状(XY面)
	 */
	public void setSymmetryXy(String symmetryXy){
		this.symmetryXy = symmetryXy;
	}
	/**
	 *方法: 取得symmetryZ
	 *@return: symmetryZ  対称形状(Z面(左右))
	 */
	
	public String getSymmetryZ(){
		return this.symmetryZ;
	}

	/**
	 *方法: 设置symmetryZ
	 *@param: symmetryZ  対称形状(Z面(左右))
	 */
	public void setSymmetryZ(String symmetryZ){
		this.symmetryZ = symmetryZ;
	}
	/**
	 *方法: 取得protuberanceX
	 *@return: protuberanceX  X面突起有無
	 */
	
	public String getProtuberanceX(){
		return this.protuberanceX;
	}

	/**
	 *方法: 设置protuberanceX
	 *@param: protuberanceX  X面突起有無
	 */
	public void setProtuberanceX(String protuberanceX){
		this.protuberanceX = protuberanceX;
	}
	/**
	 *方法: 取得protuberanceY
	 *@return: protuberanceY  Y面突起有無
	 */
	
	public String getProtuberanceY(){
		return this.protuberanceY;
	}

	/**
	 *方法: 设置protuberanceY
	 *@param: protuberanceY  Y面突起有無
	 */
	public void setProtuberanceY(String protuberanceY){
		this.protuberanceY = protuberanceY;
	}
	/**
	 *方法: 取得jointPos
	 *@return: jointPos  締結位置(内側/外側)
	 */
	
	public String getJointPos(){
		return this.jointPos;
	}

	/**
	 *方法: 设置jointPos
	 *@param: jointPos  締結位置(内側/外側)
	 */
	public void setJointPos(String jointPos){
		this.jointPos = jointPos;
	}
	/**
	 *方法: 取得jointPattern
	 *@return: jointPattern  対応締結パターン
	 */
	
	public String getJointPattern(){
		return this.jointPattern;
	}

	/**
	 *方法: 设置jointPattern
	 *@param: jointPattern  対応締結パターン
	 */
	public void setJointPattern(String jointPattern){
		this.jointPattern = jointPattern;
	}
	/**
	 *方法: 取得essentialFlutePos
	 *@return: essentialFlutePos  必須溝フレーム位置
	 */
	
	public String getEssentialFlutePos(){
		return this.essentialFlutePos;
	}

	/**
	 *方法: 设置essentialFlutePos
	 *@param: essentialFlutePos  必須溝フレーム位置
	 */
	public void setEssentialFlutePos(String essentialFlutePos){
		this.essentialFlutePos = essentialFlutePos;
	}
	/**
	 *方法: 取得coreSide
	 *@return: coreSide  主体/副体
	 */
	
	public String getCoreSide(){
		return this.coreSide;
	}

	/**
	 *方法: 设置coreSide
	 *@param: coreSide  主体/副体
	 */
	public void setCoreSide(String coreSide){
		this.coreSide = coreSide;
	}
	/**
	 *方法: 取得jointOkCategoryCd
	 *@return: jointOkCategoryCd  締結可能商品カテゴリコード
	 */
	
	public String getJointOkCategoryCd(){
		return this.jointOkCategoryCd;
	}

	/**
	 *方法: 设置jointOkCategoryCd
	 *@param: jointOkCategoryCd  締結可能商品カテゴリコード
	 */
	public void setJointOkCategoryCd(String jointOkCategoryCd){
		this.jointOkCategoryCd = jointOkCategoryCd;
	}
	/**
	 *方法: 取得seriesLeftEdge
	 *@return: seriesLeftEdge  左シリーズ：角数
	 */
	
	public String getSeriesLeftEdge(){
		return this.seriesLeftEdge;
	}

	/**
	 *方法: 设置seriesLeftEdge
	 *@param: seriesLeftEdge  左シリーズ：角数
	 */
	public void setSeriesLeftEdge(String seriesLeftEdge){
		this.seriesLeftEdge = seriesLeftEdge;
	}
	/**
	 *方法: 取得seriesRightEdge
	 *@return: seriesRightEdge  右シリーズ：角数
	 */
	
	public String getSeriesRightEdge(){
		return this.seriesRightEdge;
	}

	/**
	 *方法: 设置seriesRightEdge
	 *@param: seriesRightEdge  右シリーズ：角数
	 */
	public void setSeriesRightEdge(String seriesRightEdge){
		this.seriesRightEdge = seriesRightEdge;
	}
	/**
	 *方法: 取得hingeLr
	 *@return: hingeLr  勝手(左右)
	 */
	
	public String getHingeLr(){
		return this.hingeLr;
	}

	/**
	 *方法: 设置hingeLr
	 *@param: hingeLr  勝手(左右)
	 */
	public void setHingeLr(String hingeLr){
		this.hingeLr = hingeLr;
	}
	/**
	 *方法: 取得holePos1
	 *@return: holePos1  穴位置1(X,Y,Z)
	 */
	
	public String getHolePos1(){
		return this.holePos1;
	}

	/**
	 *方法: 设置holePos1
	 *@param: holePos1  穴位置1(X,Y,Z)
	 */
	public void setHolePos1(String holePos1){
		this.holePos1 = holePos1;
	}
	/**
	 *方法: 取得holeCourse1
	 *@return: holeCourse1  穴向き1(X,Y,Z)
	 */
	
	public String getHoleCourse1(){
		return this.holeCourse1;
	}

	/**
	 *方法: 设置holeCourse1
	 *@param: holeCourse1  穴向き1(X,Y,Z)
	 */
	public void setHoleCourse1(String holeCourse1){
		this.holeCourse1 = holeCourse1;
	}
	/**
	 *方法: 取得holeDepth1
	 *@return: holeDepth1  穴深さ1
	 */
	
	public BigDecimal getHoleDepth1(){
		return this.holeDepth1;
	}

	/**
	 *方法: 设置holeDepth1
	 *@param: holeDepth1  穴深さ1
	 */
	public void setHoleDepth1(BigDecimal holeDepth1){
		this.holeDepth1 = holeDepth1;
	}
	/**
	 *方法: 取得fitBolt1
	 *@return: fitBolt1  適合ボルト1
	 */
	
	public String getFitBolt1(){
		return this.fitBolt1;
	}

	/**
	 *方法: 设置fitBolt1
	 *@param: fitBolt1  適合ボルト1
	 */
	public void setFitBolt1(String fitBolt1){
		this.fitBolt1 = fitBolt1;
	}
	/**
	 *方法: 取得fitNut1
	 *@return: fitNut1  適合ナット1
	 */
	
	public String getFitNut1(){
		return this.fitNut1;
	}

	/**
	 *方法: 设置fitNut1
	 *@param: fitNut1  適合ナット1
	 */
	public void setFitNut1(String fitNut1){
		this.fitNut1 = fitNut1;
	}
	/**
	 *方法: 取得fitBoltKind1
	 *@return: fitBoltKind1  適合ボルト種類1
	 */
	
	public String getFitBoltKind1(){
		return this.fitBoltKind1;
	}

	/**
	 *方法: 设置fitBoltKind1
	 *@param: fitBoltKind1  適合ボルト種類1
	 */
	public void setFitBoltKind1(String fitBoltKind1){
		this.fitBoltKind1 = fitBoltKind1;
	}
	/**
	 *方法: 取得holeKind1
	 *@return: holeKind1  穴種類1
	 */
	
	public String getHoleKind1(){
		return this.holeKind1;
	}

	/**
	 *方法: 设置holeKind1
	 *@param: holeKind1  穴種類1
	 */
	public void setHoleKind1(String holeKind1){
		this.holeKind1 = holeKind1;
	}
	/**
	 *方法: 取得holeDiameter1
	 *@return: holeDiameter1  穴径1
	 */
	
	public String getHoleDiameter1(){
		return this.holeDiameter1;
	}

	/**
	 *方法: 设置holeDiameter1
	 *@param: holeDiameter1  穴径1
	 */
	public void setHoleDiameter1(String holeDiameter1){
		this.holeDiameter1 = holeDiameter1;
	}
	/**
	 *方法: 取得accessory1
	 *@return: accessory1  付属品区分1
	 */
	
	public String getAccessory1(){
		return this.accessory1;
	}

	/**
	 *方法: 设置accessory1
	 *@param: accessory1  付属品区分1
	 */
	public void setAccessory1(String accessory1){
		this.accessory1 = accessory1;
	}
	/**
	 *方法: 取得holePos2
	 *@return: holePos2  穴位置2(X,Y,Z)
	 */
	
	public String getHolePos2(){
		return this.holePos2;
	}

	/**
	 *方法: 设置holePos2
	 *@param: holePos2  穴位置2(X,Y,Z)
	 */
	public void setHolePos2(String holePos2){
		this.holePos2 = holePos2;
	}
	/**
	 *方法: 取得holeCourse2
	 *@return: holeCourse2  穴向き2(X,Y,Z)
	 */
	
	public String getHoleCourse2(){
		return this.holeCourse2;
	}

	/**
	 *方法: 设置holeCourse2
	 *@param: holeCourse2  穴向き2(X,Y,Z)
	 */
	public void setHoleCourse2(String holeCourse2){
		this.holeCourse2 = holeCourse2;
	}
	/**
	 *方法: 取得holeDepth2
	 *@return: holeDepth2  穴深さ2
	 */
	
	public BigDecimal getHoleDepth2(){
		return this.holeDepth2;
	}

	/**
	 *方法: 设置holeDepth2
	 *@param: holeDepth2  穴深さ2
	 */
	public void setHoleDepth2(BigDecimal holeDepth2){
		this.holeDepth2 = holeDepth2;
	}
	/**
	 *方法: 取得fitBolt2
	 *@return: fitBolt2  適合ボルト2
	 */
	
	public String getFitBolt2(){
		return this.fitBolt2;
	}

	/**
	 *方法: 设置fitBolt2
	 *@param: fitBolt2  適合ボルト2
	 */
	public void setFitBolt2(String fitBolt2){
		this.fitBolt2 = fitBolt2;
	}
	/**
	 *方法: 取得fitNut2
	 *@return: fitNut2  適合ナット2
	 */
	
	public String getFitNut2(){
		return this.fitNut2;
	}

	/**
	 *方法: 设置fitNut2
	 *@param: fitNut2  適合ナット2
	 */
	public void setFitNut2(String fitNut2){
		this.fitNut2 = fitNut2;
	}
	/**
	 *方法: 取得fitBoltKind2
	 *@return: fitBoltKind2  適合ボルト種類2
	 */
	
	public String getFitBoltKind2(){
		return this.fitBoltKind2;
	}

	/**
	 *方法: 设置fitBoltKind2
	 *@param: fitBoltKind2  適合ボルト種類2
	 */
	public void setFitBoltKind2(String fitBoltKind2){
		this.fitBoltKind2 = fitBoltKind2;
	}
	/**
	 *方法: 取得holeKind2
	 *@return: holeKind2  穴種類2
	 */
	
	public String getHoleKind2(){
		return this.holeKind2;
	}

	/**
	 *方法: 设置holeKind2
	 *@param: holeKind2  穴種類2
	 */
	public void setHoleKind2(String holeKind2){
		this.holeKind2 = holeKind2;
	}
	/**
	 *方法: 取得holeDiameter2
	 *@return: holeDiameter2  穴径2
	 */
	
	public String getHoleDiameter2(){
		return this.holeDiameter2;
	}

	/**
	 *方法: 设置holeDiameter2
	 *@param: holeDiameter2  穴径2
	 */
	public void setHoleDiameter2(String holeDiameter2){
		this.holeDiameter2 = holeDiameter2;
	}
	/**
	 *方法: 取得accessory2
	 *@return: accessory2  付属品区分2
	 */
	
	public String getAccessory2(){
		return this.accessory2;
	}

	/**
	 *方法: 设置accessory2
	 *@param: accessory2  付属品区分2
	 */
	public void setAccessory2(String accessory2){
		this.accessory2 = accessory2;
	}
	/**
	 *方法: 取得holePos3
	 *@return: holePos3  穴位置3(X,Y,Z)
	 */
	
	public String getHolePos3(){
		return this.holePos3;
	}

	/**
	 *方法: 设置holePos3
	 *@param: holePos3  穴位置3(X,Y,Z)
	 */
	public void setHolePos3(String holePos3){
		this.holePos3 = holePos3;
	}
	/**
	 *方法: 取得holeCourse3
	 *@return: holeCourse3  穴向き3(X,Y,Z)
	 */
	
	public String getHoleCourse3(){
		return this.holeCourse3;
	}

	/**
	 *方法: 设置holeCourse3
	 *@param: holeCourse3  穴向き3(X,Y,Z)
	 */
	public void setHoleCourse3(String holeCourse3){
		this.holeCourse3 = holeCourse3;
	}
	/**
	 *方法: 取得holeDepth3
	 *@return: holeDepth3  穴深さ3
	 */
	
	public BigDecimal getHoleDepth3(){
		return this.holeDepth3;
	}

	/**
	 *方法: 设置holeDepth3
	 *@param: holeDepth3  穴深さ3
	 */
	public void setHoleDepth3(BigDecimal holeDepth3){
		this.holeDepth3 = holeDepth3;
	}
	/**
	 *方法: 取得fitBolt3
	 *@return: fitBolt3  適合ボルト3
	 */
	
	public String getFitBolt3(){
		return this.fitBolt3;
	}

	/**
	 *方法: 设置fitBolt3
	 *@param: fitBolt3  適合ボルト3
	 */
	public void setFitBolt3(String fitBolt3){
		this.fitBolt3 = fitBolt3;
	}
	/**
	 *方法: 取得fitNut3
	 *@return: fitNut3  適合ナット3
	 */
	
	public String getFitNut3(){
		return this.fitNut3;
	}

	/**
	 *方法: 设置fitNut3
	 *@param: fitNut3  適合ナット3
	 */
	public void setFitNut3(String fitNut3){
		this.fitNut3 = fitNut3;
	}
	/**
	 *方法: 取得fitBoltKind3
	 *@return: fitBoltKind3  適合ボルト種類3
	 */
	
	public String getFitBoltKind3(){
		return this.fitBoltKind3;
	}

	/**
	 *方法: 设置fitBoltKind3
	 *@param: fitBoltKind3  適合ボルト種類3
	 */
	public void setFitBoltKind3(String fitBoltKind3){
		this.fitBoltKind3 = fitBoltKind3;
	}
	/**
	 *方法: 取得holeKind3
	 *@return: holeKind3  穴種類3
	 */
	
	public String getHoleKind3(){
		return this.holeKind3;
	}

	/**
	 *方法: 设置holeKind3
	 *@param: holeKind3  穴種類3
	 */
	public void setHoleKind3(String holeKind3){
		this.holeKind3 = holeKind3;
	}
	/**
	 *方法: 取得holeDiameter3
	 *@return: holeDiameter3  穴径3
	 */
	
	public String getHoleDiameter3(){
		return this.holeDiameter3;
	}

	/**
	 *方法: 设置holeDiameter3
	 *@param: holeDiameter3  穴径3
	 */
	public void setHoleDiameter3(String holeDiameter3){
		this.holeDiameter3 = holeDiameter3;
	}
	/**
	 *方法: 取得accessory3
	 *@return: accessory3  付属品区分3
	 */
	
	public String getAccessory3(){
		return this.accessory3;
	}

	/**
	 *方法: 设置accessory3
	 *@param: accessory3  付属品区分3
	 */
	public void setAccessory3(String accessory3){
		this.accessory3 = accessory3;
	}
	/**
	 *方法: 取得holePos4
	 *@return: holePos4  穴位置4(X,Y,Z)
	 */
	
	public String getHolePos4(){
		return this.holePos4;
	}

	/**
	 *方法: 设置holePos4
	 *@param: holePos4  穴位置4(X,Y,Z)
	 */
	public void setHolePos4(String holePos4){
		this.holePos4 = holePos4;
	}
	/**
	 *方法: 取得holeCourse4
	 *@return: holeCourse4  穴向き4(X,Y,Z)
	 */
	
	public String getHoleCourse4(){
		return this.holeCourse4;
	}

	/**
	 *方法: 设置holeCourse4
	 *@param: holeCourse4  穴向き4(X,Y,Z)
	 */
	public void setHoleCourse4(String holeCourse4){
		this.holeCourse4 = holeCourse4;
	}
	/**
	 *方法: 取得holeDepth4
	 *@return: holeDepth4  穴深さ4
	 */
	
	public BigDecimal getHoleDepth4(){
		return this.holeDepth4;
	}

	/**
	 *方法: 设置holeDepth4
	 *@param: holeDepth4  穴深さ4
	 */
	public void setHoleDepth4(BigDecimal holeDepth4){
		this.holeDepth4 = holeDepth4;
	}
	/**
	 *方法: 取得fitBolt4
	 *@return: fitBolt4  適合ボルト4
	 */
	
	public String getFitBolt4(){
		return this.fitBolt4;
	}

	/**
	 *方法: 设置fitBolt4
	 *@param: fitBolt4  適合ボルト4
	 */
	public void setFitBolt4(String fitBolt4){
		this.fitBolt4 = fitBolt4;
	}
	/**
	 *方法: 取得fitNut4
	 *@return: fitNut4  適合ナット4
	 */
	
	public String getFitNut4(){
		return this.fitNut4;
	}

	/**
	 *方法: 设置fitNut4
	 *@param: fitNut4  適合ナット4
	 */
	public void setFitNut4(String fitNut4){
		this.fitNut4 = fitNut4;
	}
	/**
	 *方法: 取得fitBoltKind4
	 *@return: fitBoltKind4  適合ボルト種類4
	 */
	
	public String getFitBoltKind4(){
		return this.fitBoltKind4;
	}

	/**
	 *方法: 设置fitBoltKind4
	 *@param: fitBoltKind4  適合ボルト種類4
	 */
	public void setFitBoltKind4(String fitBoltKind4){
		this.fitBoltKind4 = fitBoltKind4;
	}
	/**
	 *方法: 取得holeKind4
	 *@return: holeKind4  穴種類4
	 */
	
	public String getHoleKind4(){
		return this.holeKind4;
	}

	/**
	 *方法: 设置holeKind4
	 *@param: holeKind4  穴種類4
	 */
	public void setHoleKind4(String holeKind4){
		this.holeKind4 = holeKind4;
	}
	/**
	 *方法: 取得holeDiameter4
	 *@return: holeDiameter4  穴径4
	 */
	
	public String getHoleDiameter4(){
		return this.holeDiameter4;
	}

	/**
	 *方法: 设置holeDiameter4
	 *@param: holeDiameter4  穴径4
	 */
	public void setHoleDiameter4(String holeDiameter4){
		this.holeDiameter4 = holeDiameter4;
	}
	/**
	 *方法: 取得accessory4
	 *@return: accessory4  付属品区分4
	 */
	
	public String getAccessory4(){
		return this.accessory4;
	}

	/**
	 *方法: 设置accessory4
	 *@param: accessory4  付属品区分4
	 */
	public void setAccessory4(String accessory4){
		this.accessory4 = accessory4;
	}
	/**
	 *方法: 取得holePos5
	 *@return: holePos5  穴位置5(X,Y,Z)
	 */
	
	public String getHolePos5(){
		return this.holePos5;
	}

	/**
	 *方法: 设置holePos5
	 *@param: holePos5  穴位置5(X,Y,Z)
	 */
	public void setHolePos5(String holePos5){
		this.holePos5 = holePos5;
	}
	/**
	 *方法: 取得holeCourse5
	 *@return: holeCourse5  穴向き5(X,Y,Z)
	 */
	
	public String getHoleCourse5(){
		return this.holeCourse5;
	}

	/**
	 *方法: 设置holeCourse5
	 *@param: holeCourse5  穴向き5(X,Y,Z)
	 */
	public void setHoleCourse5(String holeCourse5){
		this.holeCourse5 = holeCourse5;
	}
	/**
	 *方法: 取得holeDepth5
	 *@return: holeDepth5  穴深さ5
	 */
	
	public BigDecimal getHoleDepth5(){
		return this.holeDepth5;
	}

	/**
	 *方法: 设置holeDepth5
	 *@param: holeDepth5  穴深さ5
	 */
	public void setHoleDepth5(BigDecimal holeDepth5){
		this.holeDepth5 = holeDepth5;
	}
	/**
	 *方法: 取得fitBolt5
	 *@return: fitBolt5  適合ボルト5
	 */
	
	public String getFitBolt5(){
		return this.fitBolt5;
	}

	/**
	 *方法: 设置fitBolt5
	 *@param: fitBolt5  適合ボルト5
	 */
	public void setFitBolt5(String fitBolt5){
		this.fitBolt5 = fitBolt5;
	}
	/**
	 *方法: 取得fitNut5
	 *@return: fitNut5  適合ナット5
	 */
	
	public String getFitNut5(){
		return this.fitNut5;
	}

	/**
	 *方法: 设置fitNut5
	 *@param: fitNut5  適合ナット5
	 */
	public void setFitNut5(String fitNut5){
		this.fitNut5 = fitNut5;
	}
	/**
	 *方法: 取得fitBoltKind5
	 *@return: fitBoltKind5  適合ボルト種類5
	 */
	
	public String getFitBoltKind5(){
		return this.fitBoltKind5;
	}

	/**
	 *方法: 设置fitBoltKind5
	 *@param: fitBoltKind5  適合ボルト種類5
	 */
	public void setFitBoltKind5(String fitBoltKind5){
		this.fitBoltKind5 = fitBoltKind5;
	}
	/**
	 *方法: 取得holeKind5
	 *@return: holeKind5  穴種類5
	 */
	
	public String getHoleKind5(){
		return this.holeKind5;
	}

	/**
	 *方法: 设置holeKind5
	 *@param: holeKind5  穴種類5
	 */
	public void setHoleKind5(String holeKind5){
		this.holeKind5 = holeKind5;
	}
	/**
	 *方法: 取得holeDiameter5
	 *@return: holeDiameter5  穴径5
	 */
	
	public String getHoleDiameter5(){
		return this.holeDiameter5;
	}

	/**
	 *方法: 设置holeDiameter5
	 *@param: holeDiameter5  穴径5
	 */
	public void setHoleDiameter5(String holeDiameter5){
		this.holeDiameter5 = holeDiameter5;
	}
	/**
	 *方法: 取得accessory5
	 *@return: accessory5  付属品区分5
	 */
	
	public String getAccessory5(){
		return this.accessory5;
	}

	/**
	 *方法: 设置accessory5
	 *@param: accessory5  付属品区分5
	 */
	public void setAccessory5(String accessory5){
		this.accessory5 = accessory5;
	}
	/**
	 *方法: 取得holePos6
	 *@return: holePos6  穴位置6(X,Y,Z)
	 */
	
	public String getHolePos6(){
		return this.holePos6;
	}

	/**
	 *方法: 设置holePos6
	 *@param: holePos6  穴位置6(X,Y,Z)
	 */
	public void setHolePos6(String holePos6){
		this.holePos6 = holePos6;
	}
	/**
	 *方法: 取得holeCourse6
	 *@return: holeCourse6  穴向き6(X,Y,Z)
	 */
	
	public String getHoleCourse6(){
		return this.holeCourse6;
	}

	/**
	 *方法: 设置holeCourse6
	 *@param: holeCourse6  穴向き6(X,Y,Z)
	 */
	public void setHoleCourse6(String holeCourse6){
		this.holeCourse6 = holeCourse6;
	}
	/**
	 *方法: 取得holeDepth6
	 *@return: holeDepth6  穴深さ6
	 */
	
	public BigDecimal getHoleDepth6(){
		return this.holeDepth6;
	}

	/**
	 *方法: 设置holeDepth6
	 *@param: holeDepth6  穴深さ6
	 */
	public void setHoleDepth6(BigDecimal holeDepth6){
		this.holeDepth6 = holeDepth6;
	}
	/**
	 *方法: 取得fitBolt6
	 *@return: fitBolt6  適合ボルト6
	 */
	
	public String getFitBolt6(){
		return this.fitBolt6;
	}

	/**
	 *方法: 设置fitBolt6
	 *@param: fitBolt6  適合ボルト6
	 */
	public void setFitBolt6(String fitBolt6){
		this.fitBolt6 = fitBolt6;
	}
	/**
	 *方法: 取得fitNut6
	 *@return: fitNut6  適合ナット6
	 */
	
	public String getFitNut6(){
		return this.fitNut6;
	}

	/**
	 *方法: 设置fitNut6
	 *@param: fitNut6  適合ナット6
	 */
	public void setFitNut6(String fitNut6){
		this.fitNut6 = fitNut6;
	}
	/**
	 *方法: 取得fitBoltKind6
	 *@return: fitBoltKind6  適合ボルト種類6
	 */
	
	public String getFitBoltKind6(){
		return this.fitBoltKind6;
	}

	/**
	 *方法: 设置fitBoltKind6
	 *@param: fitBoltKind6  適合ボルト種類6
	 */
	public void setFitBoltKind6(String fitBoltKind6){
		this.fitBoltKind6 = fitBoltKind6;
	}
	/**
	 *方法: 取得holeKind6
	 *@return: holeKind6  穴種類6
	 */
	
	public String getHoleKind6(){
		return this.holeKind6;
	}

	/**
	 *方法: 设置holeKind6
	 *@param: holeKind6  穴種類6
	 */
	public void setHoleKind6(String holeKind6){
		this.holeKind6 = holeKind6;
	}
	/**
	 *方法: 取得holeDiameter6
	 *@return: holeDiameter6  穴径6
	 */
	
	public String getHoleDiameter6(){
		return this.holeDiameter6;
	}

	/**
	 *方法: 设置holeDiameter6
	 *@param: holeDiameter6  穴径6
	 */
	public void setHoleDiameter6(String holeDiameter6){
		this.holeDiameter6 = holeDiameter6;
	}
	/**
	 *方法: 取得accessory6
	 *@return: accessory6  付属品区分6
	 */
	
	public String getAccessory6(){
		return this.accessory6;
	}

	/**
	 *方法: 设置accessory6
	 *@param: accessory6  付属品区分6
	 */
	public void setAccessory6(String accessory6){
		this.accessory6 = accessory6;
	}
	/**
	 *方法: 取得holePos7
	 *@return: holePos7  穴位置7(X,Y,Z)
	 */
	
	public String getHolePos7(){
		return this.holePos7;
	}

	/**
	 *方法: 设置holePos7
	 *@param: holePos7  穴位置7(X,Y,Z)
	 */
	public void setHolePos7(String holePos7){
		this.holePos7 = holePos7;
	}
	/**
	 *方法: 取得holeCourse7
	 *@return: holeCourse7  穴向き7(X,Y,Z)
	 */
	
	public String getHoleCourse7(){
		return this.holeCourse7;
	}

	/**
	 *方法: 设置holeCourse7
	 *@param: holeCourse7  穴向き7(X,Y,Z)
	 */
	public void setHoleCourse7(String holeCourse7){
		this.holeCourse7 = holeCourse7;
	}
	/**
	 *方法: 取得holeDepth7
	 *@return: holeDepth7  穴深さ7
	 */
	
	public BigDecimal getHoleDepth7(){
		return this.holeDepth7;
	}

	/**
	 *方法: 设置holeDepth7
	 *@param: holeDepth7  穴深さ7
	 */
	public void setHoleDepth7(BigDecimal holeDepth7){
		this.holeDepth7 = holeDepth7;
	}
	/**
	 *方法: 取得fitBolt7
	 *@return: fitBolt7  適合ボルト7
	 */
	
	public String getFitBolt7(){
		return this.fitBolt7;
	}

	/**
	 *方法: 设置fitBolt7
	 *@param: fitBolt7  適合ボルト7
	 */
	public void setFitBolt7(String fitBolt7){
		this.fitBolt7 = fitBolt7;
	}
	/**
	 *方法: 取得fitNut7
	 *@return: fitNut7  適合ナット7
	 */
	
	public String getFitNut7(){
		return this.fitNut7;
	}

	/**
	 *方法: 设置fitNut7
	 *@param: fitNut7  適合ナット7
	 */
	public void setFitNut7(String fitNut7){
		this.fitNut7 = fitNut7;
	}
	/**
	 *方法: 取得fitBoltKind7
	 *@return: fitBoltKind7  適合ボルト種類7
	 */
	
	public String getFitBoltKind7(){
		return this.fitBoltKind7;
	}

	/**
	 *方法: 设置fitBoltKind7
	 *@param: fitBoltKind7  適合ボルト種類7
	 */
	public void setFitBoltKind7(String fitBoltKind7){
		this.fitBoltKind7 = fitBoltKind7;
	}
	/**
	 *方法: 取得holeKind7
	 *@return: holeKind7  穴種類7
	 */
	
	public String getHoleKind7(){
		return this.holeKind7;
	}

	/**
	 *方法: 设置holeKind7
	 *@param: holeKind7  穴種類7
	 */
	public void setHoleKind7(String holeKind7){
		this.holeKind7 = holeKind7;
	}
	/**
	 *方法: 取得holeDiameter7
	 *@return: holeDiameter7  穴径7
	 */
	
	public String getHoleDiameter7(){
		return this.holeDiameter7;
	}

	/**
	 *方法: 设置holeDiameter7
	 *@param: holeDiameter7  穴径7
	 */
	public void setHoleDiameter7(String holeDiameter7){
		this.holeDiameter7 = holeDiameter7;
	}
	/**
	 *方法: 取得accessory7
	 *@return: accessory7  付属品区分7
	 */
	
	public String getAccessory7(){
		return this.accessory7;
	}

	/**
	 *方法: 设置accessory7
	 *@param: accessory7  付属品区分7
	 */
	public void setAccessory7(String accessory7){
		this.accessory7 = accessory7;
	}
	/**
	 *方法: 取得holePos8
	 *@return: holePos8  穴位置8(X,Y,Z)
	 */
	
	public String getHolePos8(){
		return this.holePos8;
	}

	/**
	 *方法: 设置holePos8
	 *@param: holePos8  穴位置8(X,Y,Z)
	 */
	public void setHolePos8(String holePos8){
		this.holePos8 = holePos8;
	}
	/**
	 *方法: 取得holeCourse8
	 *@return: holeCourse8  穴向き8(X,Y,Z)
	 */
	
	public String getHoleCourse8(){
		return this.holeCourse8;
	}

	/**
	 *方法: 设置holeCourse8
	 *@param: holeCourse8  穴向き8(X,Y,Z)
	 */
	public void setHoleCourse8(String holeCourse8){
		this.holeCourse8 = holeCourse8;
	}
	/**
	 *方法: 取得holeDepth8
	 *@return: holeDepth8  穴深さ8
	 */
	
	public BigDecimal getHoleDepth8(){
		return this.holeDepth8;
	}

	/**
	 *方法: 设置holeDepth8
	 *@param: holeDepth8  穴深さ8
	 */
	public void setHoleDepth8(BigDecimal holeDepth8){
		this.holeDepth8 = holeDepth8;
	}
	/**
	 *方法: 取得fitBolt8
	 *@return: fitBolt8  適合ボルト8
	 */
	
	public String getFitBolt8(){
		return this.fitBolt8;
	}

	/**
	 *方法: 设置fitBolt8
	 *@param: fitBolt8  適合ボルト8
	 */
	public void setFitBolt8(String fitBolt8){
		this.fitBolt8 = fitBolt8;
	}
	/**
	 *方法: 取得fitNut8
	 *@return: fitNut8  適合ナット8
	 */
	
	public String getFitNut8(){
		return this.fitNut8;
	}

	/**
	 *方法: 设置fitNut8
	 *@param: fitNut8  適合ナット8
	 */
	public void setFitNut8(String fitNut8){
		this.fitNut8 = fitNut8;
	}
	/**
	 *方法: 取得fitBoltKind8
	 *@return: fitBoltKind8  適合ボルト種類8
	 */
	
	public String getFitBoltKind8(){
		return this.fitBoltKind8;
	}

	/**
	 *方法: 设置fitBoltKind8
	 *@param: fitBoltKind8  適合ボルト種類8
	 */
	public void setFitBoltKind8(String fitBoltKind8){
		this.fitBoltKind8 = fitBoltKind8;
	}
	/**
	 *方法: 取得holeKind8
	 *@return: holeKind8  穴種類8
	 */
	
	public String getHoleKind8(){
		return this.holeKind8;
	}

	/**
	 *方法: 设置holeKind8
	 *@param: holeKind8  穴種類8
	 */
	public void setHoleKind8(String holeKind8){
		this.holeKind8 = holeKind8;
	}
	/**
	 *方法: 取得holeDiameter8
	 *@return: holeDiameter8  穴径8
	 */
	
	public String getHoleDiameter8(){
		return this.holeDiameter8;
	}

	/**
	 *方法: 设置holeDiameter8
	 *@param: holeDiameter8  穴径8
	 */
	public void setHoleDiameter8(String holeDiameter8){
		this.holeDiameter8 = holeDiameter8;
	}
	/**
	 *方法: 取得accessory8
	 *@return: accessory8  付属品区分8
	 */
	
	public String getAccessory8(){
		return this.accessory8;
	}

	/**
	 *方法: 设置accessory8
	 *@param: accessory8  付属品区分8
	 */
	public void setAccessory8(String accessory8){
		this.accessory8 = accessory8;
	}
	/**
	 *方法: 取得holePos9
	 *@return: holePos9  穴位置9(X,Y,Z)
	 */
	
	public String getHolePos9(){
		return this.holePos9;
	}

	/**
	 *方法: 设置holePos9
	 *@param: holePos9  穴位置9(X,Y,Z)
	 */
	public void setHolePos9(String holePos9){
		this.holePos9 = holePos9;
	}
	/**
	 *方法: 取得holeCourse9
	 *@return: holeCourse9  穴向き9(X,Y,Z)
	 */
	
	public String getHoleCourse9(){
		return this.holeCourse9;
	}

	/**
	 *方法: 设置holeCourse9
	 *@param: holeCourse9  穴向き9(X,Y,Z)
	 */
	public void setHoleCourse9(String holeCourse9){
		this.holeCourse9 = holeCourse9;
	}
	/**
	 *方法: 取得holeDepth9
	 *@return: holeDepth9  穴深さ9
	 */
	
	public BigDecimal getHoleDepth9(){
		return this.holeDepth9;
	}

	/**
	 *方法: 设置holeDepth9
	 *@param: holeDepth9  穴深さ9
	 */
	public void setHoleDepth9(BigDecimal holeDepth9){
		this.holeDepth9 = holeDepth9;
	}
	/**
	 *方法: 取得fitBolt9
	 *@return: fitBolt9  適合ボルト9
	 */
	
	public String getFitBolt9(){
		return this.fitBolt9;
	}

	/**
	 *方法: 设置fitBolt9
	 *@param: fitBolt9  適合ボルト9
	 */
	public void setFitBolt9(String fitBolt9){
		this.fitBolt9 = fitBolt9;
	}
	/**
	 *方法: 取得fitNut9
	 *@return: fitNut9  適合ナット9
	 */
	
	public String getFitNut9(){
		return this.fitNut9;
	}

	/**
	 *方法: 设置fitNut9
	 *@param: fitNut9  適合ナット9
	 */
	public void setFitNut9(String fitNut9){
		this.fitNut9 = fitNut9;
	}
	/**
	 *方法: 取得fitBoltKind9
	 *@return: fitBoltKind9  適合ボルト種類9
	 */
	
	public String getFitBoltKind9(){
		return this.fitBoltKind9;
	}

	/**
	 *方法: 设置fitBoltKind9
	 *@param: fitBoltKind9  適合ボルト種類9
	 */
	public void setFitBoltKind9(String fitBoltKind9){
		this.fitBoltKind9 = fitBoltKind9;
	}
	/**
	 *方法: 取得holeKind9
	 *@return: holeKind9  穴種類9
	 */
	
	public String getHoleKind9(){
		return this.holeKind9;
	}

	/**
	 *方法: 设置holeKind9
	 *@param: holeKind9  穴種類9
	 */
	public void setHoleKind9(String holeKind9){
		this.holeKind9 = holeKind9;
	}
	/**
	 *方法: 取得holeDiameter9
	 *@return: holeDiameter9  穴径9
	 */
	
	public String getHoleDiameter9(){
		return this.holeDiameter9;
	}

	/**
	 *方法: 设置holeDiameter9
	 *@param: holeDiameter9  穴径9
	 */
	public void setHoleDiameter9(String holeDiameter9){
		this.holeDiameter9 = holeDiameter9;
	}
	/**
	 *方法: 取得accessory9
	 *@return: accessory9  付属品区分9
	 */
	
	public String getAccessory9(){
		return this.accessory9;
	}

	/**
	 *方法: 设置accessory9
	 *@param: accessory9  付属品区分9
	 */
	public void setAccessory9(String accessory9){
		this.accessory9 = accessory9;
	}
	/**
	 *方法: 取得holePos10
	 *@return: holePos10  穴位置10(X,Y,Z)
	 */
	
	public String getHolePos10(){
		return this.holePos10;
	}

	/**
	 *方法: 设置holePos10
	 *@param: holePos10  穴位置10(X,Y,Z)
	 */
	public void setHolePos10(String holePos10){
		this.holePos10 = holePos10;
	}
	/**
	 *方法: 取得holeCourse10
	 *@return: holeCourse10  穴向き10(X,Y,Z)
	 */
	
	public String getHoleCourse10(){
		return this.holeCourse10;
	}

	/**
	 *方法: 设置holeCourse10
	 *@param: holeCourse10  穴向き10(X,Y,Z)
	 */
	public void setHoleCourse10(String holeCourse10){
		this.holeCourse10 = holeCourse10;
	}
	/**
	 *方法: 取得holeDepth10
	 *@return: holeDepth10  穴深さ10
	 */
	
	public BigDecimal getHoleDepth10(){
		return this.holeDepth10;
	}

	/**
	 *方法: 设置holeDepth10
	 *@param: holeDepth10  穴深さ10
	 */
	public void setHoleDepth10(BigDecimal holeDepth10){
		this.holeDepth10 = holeDepth10;
	}
	/**
	 *方法: 取得fitBolt10
	 *@return: fitBolt10  適合ボルト10
	 */
	
	public String getFitBolt10(){
		return this.fitBolt10;
	}

	/**
	 *方法: 设置fitBolt10
	 *@param: fitBolt10  適合ボルト10
	 */
	public void setFitBolt10(String fitBolt10){
		this.fitBolt10 = fitBolt10;
	}
	/**
	 *方法: 取得fitNut10
	 *@return: fitNut10  適合ナット10
	 */
	
	public String getFitNut10(){
		return this.fitNut10;
	}

	/**
	 *方法: 设置fitNut10
	 *@param: fitNut10  適合ナット10
	 */
	public void setFitNut10(String fitNut10){
		this.fitNut10 = fitNut10;
	}
	/**
	 *方法: 取得fitBoltKind10
	 *@return: fitBoltKind10  適合ボルト種類10
	 */
	
	public String getFitBoltKind10(){
		return this.fitBoltKind10;
	}

	/**
	 *方法: 设置fitBoltKind10
	 *@param: fitBoltKind10  適合ボルト種類10
	 */
	public void setFitBoltKind10(String fitBoltKind10){
		this.fitBoltKind10 = fitBoltKind10;
	}
	/**
	 *方法: 取得holeKind10
	 *@return: holeKind10  穴種類10
	 */
	
	public String getHoleKind10(){
		return this.holeKind10;
	}

	/**
	 *方法: 设置holeKind10
	 *@param: holeKind10  穴種類10
	 */
	public void setHoleKind10(String holeKind10){
		this.holeKind10 = holeKind10;
	}
	/**
	 *方法: 取得holeDiameter10
	 *@return: holeDiameter10  穴径10
	 */
	
	public String getHoleDiameter10(){
		return this.holeDiameter10;
	}

	/**
	 *方法: 设置holeDiameter10
	 *@param: holeDiameter10  穴径10
	 */
	public void setHoleDiameter10(String holeDiameter10){
		this.holeDiameter10 = holeDiameter10;
	}
	/**
	 *方法: 取得accessory10
	 *@return: accessory10  付属品区分10
	 */
	
	public String getAccessory10(){
		return this.accessory10;
	}

	/**
	 *方法: 设置accessory10
	 *@param: accessory10  付属品区分10
	 */
	public void setAccessory10(String accessory10){
		this.accessory10 = accessory10;
	}
	/**
	 *方法: 取得holePos11
	 *@return: holePos11  穴位置11(X,Y,Z)
	 */
	
	public String getHolePos11(){
		return this.holePos11;
	}

	/**
	 *方法: 设置holePos11
	 *@param: holePos11  穴位置11(X,Y,Z)
	 */
	public void setHolePos11(String holePos11){
		this.holePos11 = holePos11;
	}
	/**
	 *方法: 取得holeCourse11
	 *@return: holeCourse11  穴向き11(X,Y,Z)
	 */
	
	public String getHoleCourse11(){
		return this.holeCourse11;
	}

	/**
	 *方法: 设置holeCourse11
	 *@param: holeCourse11  穴向き11(X,Y,Z)
	 */
	public void setHoleCourse11(String holeCourse11){
		this.holeCourse11 = holeCourse11;
	}
	/**
	 *方法: 取得holeDepth11
	 *@return: holeDepth11  穴深さ11
	 */
	
	public BigDecimal getHoleDepth11(){
		return this.holeDepth11;
	}

	/**
	 *方法: 设置holeDepth11
	 *@param: holeDepth11  穴深さ11
	 */
	public void setHoleDepth11(BigDecimal holeDepth11){
		this.holeDepth11 = holeDepth11;
	}
	/**
	 *方法: 取得fitBolt11
	 *@return: fitBolt11  適合ボルト11
	 */
	
	public String getFitBolt11(){
		return this.fitBolt11;
	}

	/**
	 *方法: 设置fitBolt11
	 *@param: fitBolt11  適合ボルト11
	 */
	public void setFitBolt11(String fitBolt11){
		this.fitBolt11 = fitBolt11;
	}
	/**
	 *方法: 取得fitNut11
	 *@return: fitNut11  適合ナット11
	 */
	
	public String getFitNut11(){
		return this.fitNut11;
	}

	/**
	 *方法: 设置fitNut11
	 *@param: fitNut11  適合ナット11
	 */
	public void setFitNut11(String fitNut11){
		this.fitNut11 = fitNut11;
	}
	/**
	 *方法: 取得fitBoltKind11
	 *@return: fitBoltKind11  適合ボルト種類11
	 */
	
	public String getFitBoltKind11(){
		return this.fitBoltKind11;
	}

	/**
	 *方法: 设置fitBoltKind11
	 *@param: fitBoltKind11  適合ボルト種類11
	 */
	public void setFitBoltKind11(String fitBoltKind11){
		this.fitBoltKind11 = fitBoltKind11;
	}
	/**
	 *方法: 取得holeKind11
	 *@return: holeKind11  穴種類11
	 */
	
	public String getHoleKind11(){
		return this.holeKind11;
	}

	/**
	 *方法: 设置holeKind11
	 *@param: holeKind11  穴種類11
	 */
	public void setHoleKind11(String holeKind11){
		this.holeKind11 = holeKind11;
	}
	/**
	 *方法: 取得holeDiameter11
	 *@return: holeDiameter11  穴径11
	 */
	
	public String getHoleDiameter11(){
		return this.holeDiameter11;
	}

	/**
	 *方法: 设置holeDiameter11
	 *@param: holeDiameter11  穴径11
	 */
	public void setHoleDiameter11(String holeDiameter11){
		this.holeDiameter11 = holeDiameter11;
	}
	/**
	 *方法: 取得accessory11
	 *@return: accessory11  付属品区分11
	 */
	
	public String getAccessory11(){
		return this.accessory11;
	}

	/**
	 *方法: 设置accessory11
	 *@param: accessory11  付属品区分11
	 */
	public void setAccessory11(String accessory11){
		this.accessory11 = accessory11;
	}
	/**
	 *方法: 取得holePos12
	 *@return: holePos12  穴位置12(X,Y,Z)
	 */
	
	public String getHolePos12(){
		return this.holePos12;
	}

	/**
	 *方法: 设置holePos12
	 *@param: holePos12  穴位置12(X,Y,Z)
	 */
	public void setHolePos12(String holePos12){
		this.holePos12 = holePos12;
	}
	/**
	 *方法: 取得holeCourse12
	 *@return: holeCourse12  穴向き12(X,Y,Z)
	 */
	
	public String getHoleCourse12(){
		return this.holeCourse12;
	}

	/**
	 *方法: 设置holeCourse12
	 *@param: holeCourse12  穴向き12(X,Y,Z)
	 */
	public void setHoleCourse12(String holeCourse12){
		this.holeCourse12 = holeCourse12;
	}
	/**
	 *方法: 取得holeDepth12
	 *@return: holeDepth12  穴深さ12
	 */
	
	public BigDecimal getHoleDepth12(){
		return this.holeDepth12;
	}

	/**
	 *方法: 设置holeDepth12
	 *@param: holeDepth12  穴深さ12
	 */
	public void setHoleDepth12(BigDecimal holeDepth12){
		this.holeDepth12 = holeDepth12;
	}
	/**
	 *方法: 取得fitBolt12
	 *@return: fitBolt12  適合ボルト12
	 */
	
	public String getFitBolt12(){
		return this.fitBolt12;
	}

	/**
	 *方法: 设置fitBolt12
	 *@param: fitBolt12  適合ボルト12
	 */
	public void setFitBolt12(String fitBolt12){
		this.fitBolt12 = fitBolt12;
	}
	/**
	 *方法: 取得fitNut12
	 *@return: fitNut12  適合ナット12
	 */
	
	public String getFitNut12(){
		return this.fitNut12;
	}

	/**
	 *方法: 设置fitNut12
	 *@param: fitNut12  適合ナット12
	 */
	public void setFitNut12(String fitNut12){
		this.fitNut12 = fitNut12;
	}
	/**
	 *方法: 取得fitBoltKind12
	 *@return: fitBoltKind12  適合ボルト種類12
	 */
	
	public String getFitBoltKind12(){
		return this.fitBoltKind12;
	}

	/**
	 *方法: 设置fitBoltKind12
	 *@param: fitBoltKind12  適合ボルト種類12
	 */
	public void setFitBoltKind12(String fitBoltKind12){
		this.fitBoltKind12 = fitBoltKind12;
	}
	/**
	 *方法: 取得holeKind12
	 *@return: holeKind12  穴種類12
	 */
	
	public String getHoleKind12(){
		return this.holeKind12;
	}

	/**
	 *方法: 设置holeKind12
	 *@param: holeKind12  穴種類12
	 */
	public void setHoleKind12(String holeKind12){
		this.holeKind12 = holeKind12;
	}
	/**
	 *方法: 取得holeDiameter12
	 *@return: holeDiameter12  穴径12
	 */
	
	public String getHoleDiameter12(){
		return this.holeDiameter12;
	}

	/**
	 *方法: 设置holeDiameter12
	 *@param: holeDiameter12  穴径12
	 */
	public void setHoleDiameter12(String holeDiameter12){
		this.holeDiameter12 = holeDiameter12;
	}
	/**
	 *方法: 取得accessory12
	 *@return: accessory12  付属品区分12
	 */
	
	public String getAccessory12(){
		return this.accessory12;
	}

	/**
	 *方法: 设置accessory12
	 *@param: accessory12  付属品区分12
	 */
	public void setAccessory12(String accessory12){
		this.accessory12 = accessory12;
	}
	/**
	 *方法: 取得holePos13
	 *@return: holePos13  穴位置13(X,Y,Z)
	 */
	
	public String getHolePos13(){
		return this.holePos13;
	}

	/**
	 *方法: 设置holePos13
	 *@param: holePos13  穴位置13(X,Y,Z)
	 */
	public void setHolePos13(String holePos13){
		this.holePos13 = holePos13;
	}
	/**
	 *方法: 取得holeCourse13
	 *@return: holeCourse13  穴向き13(X,Y,Z)
	 */
	
	public String getHoleCourse13(){
		return this.holeCourse13;
	}

	/**
	 *方法: 设置holeCourse13
	 *@param: holeCourse13  穴向き13(X,Y,Z)
	 */
	public void setHoleCourse13(String holeCourse13){
		this.holeCourse13 = holeCourse13;
	}
	/**
	 *方法: 取得holeDepth13
	 *@return: holeDepth13  穴深さ13
	 */
	
	public BigDecimal getHoleDepth13(){
		return this.holeDepth13;
	}

	/**
	 *方法: 设置holeDepth13
	 *@param: holeDepth13  穴深さ13
	 */
	public void setHoleDepth13(BigDecimal holeDepth13){
		this.holeDepth13 = holeDepth13;
	}
	/**
	 *方法: 取得fitBolt13
	 *@return: fitBolt13  適合ボルト13
	 */
	
	public String getFitBolt13(){
		return this.fitBolt13;
	}

	/**
	 *方法: 设置fitBolt13
	 *@param: fitBolt13  適合ボルト13
	 */
	public void setFitBolt13(String fitBolt13){
		this.fitBolt13 = fitBolt13;
	}
	/**
	 *方法: 取得fitNut13
	 *@return: fitNut13  適合ナット13
	 */
	
	public String getFitNut13(){
		return this.fitNut13;
	}

	/**
	 *方法: 设置fitNut13
	 *@param: fitNut13  適合ナット13
	 */
	public void setFitNut13(String fitNut13){
		this.fitNut13 = fitNut13;
	}
	/**
	 *方法: 取得fitBoltKind13
	 *@return: fitBoltKind13  適合ボルト種類13
	 */
	
	public String getFitBoltKind13(){
		return this.fitBoltKind13;
	}

	/**
	 *方法: 设置fitBoltKind13
	 *@param: fitBoltKind13  適合ボルト種類13
	 */
	public void setFitBoltKind13(String fitBoltKind13){
		this.fitBoltKind13 = fitBoltKind13;
	}
	/**
	 *方法: 取得holeKind13
	 *@return: holeKind13  穴種類13
	 */
	
	public String getHoleKind13(){
		return this.holeKind13;
	}

	/**
	 *方法: 设置holeKind13
	 *@param: holeKind13  穴種類13
	 */
	public void setHoleKind13(String holeKind13){
		this.holeKind13 = holeKind13;
	}
	/**
	 *方法: 取得holeDiameter13
	 *@return: holeDiameter13  穴径13
	 */
	
	public String getHoleDiameter13(){
		return this.holeDiameter13;
	}

	/**
	 *方法: 设置holeDiameter13
	 *@param: holeDiameter13  穴径13
	 */
	public void setHoleDiameter13(String holeDiameter13){
		this.holeDiameter13 = holeDiameter13;
	}
	/**
	 *方法: 取得accessory13
	 *@return: accessory13  付属品区分13
	 */
	
	public String getAccessory13(){
		return this.accessory13;
	}

	/**
	 *方法: 设置accessory13
	 *@param: accessory13  付属品区分13
	 */
	public void setAccessory13(String accessory13){
		this.accessory13 = accessory13;
	}
	/**
	 *方法: 取得holePos14
	 *@return: holePos14  穴位置14(X,Y,Z)
	 */
	
	public String getHolePos14(){
		return this.holePos14;
	}

	/**
	 *方法: 设置holePos14
	 *@param: holePos14  穴位置14(X,Y,Z)
	 */
	public void setHolePos14(String holePos14){
		this.holePos14 = holePos14;
	}
	/**
	 *方法: 取得holeCourse14
	 *@return: holeCourse14  穴向き14(X,Y,Z)
	 */
	
	public String getHoleCourse14(){
		return this.holeCourse14;
	}

	/**
	 *方法: 设置holeCourse14
	 *@param: holeCourse14  穴向き14(X,Y,Z)
	 */
	public void setHoleCourse14(String holeCourse14){
		this.holeCourse14 = holeCourse14;
	}
	/**
	 *方法: 取得holeDepth14
	 *@return: holeDepth14  穴深さ14
	 */
	
	public BigDecimal getHoleDepth14(){
		return this.holeDepth14;
	}

	/**
	 *方法: 设置holeDepth14
	 *@param: holeDepth14  穴深さ14
	 */
	public void setHoleDepth14(BigDecimal holeDepth14){
		this.holeDepth14 = holeDepth14;
	}
	/**
	 *方法: 取得fitBolt14
	 *@return: fitBolt14  適合ボルト14
	 */
	
	public String getFitBolt14(){
		return this.fitBolt14;
	}

	/**
	 *方法: 设置fitBolt14
	 *@param: fitBolt14  適合ボルト14
	 */
	public void setFitBolt14(String fitBolt14){
		this.fitBolt14 = fitBolt14;
	}
	/**
	 *方法: 取得fitNut14
	 *@return: fitNut14  適合ナット14
	 */
	
	public String getFitNut14(){
		return this.fitNut14;
	}

	/**
	 *方法: 设置fitNut14
	 *@param: fitNut14  適合ナット14
	 */
	public void setFitNut14(String fitNut14){
		this.fitNut14 = fitNut14;
	}
	/**
	 *方法: 取得fitBoltKind14
	 *@return: fitBoltKind14  適合ボルト種類14
	 */
	
	public String getFitBoltKind14(){
		return this.fitBoltKind14;
	}

	/**
	 *方法: 设置fitBoltKind14
	 *@param: fitBoltKind14  適合ボルト種類14
	 */
	public void setFitBoltKind14(String fitBoltKind14){
		this.fitBoltKind14 = fitBoltKind14;
	}
	/**
	 *方法: 取得holeKind14
	 *@return: holeKind14  穴種類14
	 */
	
	public String getHoleKind14(){
		return this.holeKind14;
	}

	/**
	 *方法: 设置holeKind14
	 *@param: holeKind14  穴種類14
	 */
	public void setHoleKind14(String holeKind14){
		this.holeKind14 = holeKind14;
	}
	/**
	 *方法: 取得holeDiameter14
	 *@return: holeDiameter14  穴径14
	 */
	
	public String getHoleDiameter14(){
		return this.holeDiameter14;
	}

	/**
	 *方法: 设置holeDiameter14
	 *@param: holeDiameter14  穴径14
	 */
	public void setHoleDiameter14(String holeDiameter14){
		this.holeDiameter14 = holeDiameter14;
	}
	/**
	 *方法: 取得accessory14
	 *@return: accessory14  付属品区分14
	 */
	
	public String getAccessory14(){
		return this.accessory14;
	}

	/**
	 *方法: 设置accessory14
	 *@param: accessory14  付属品区分14
	 */
	public void setAccessory14(String accessory14){
		this.accessory14 = accessory14;
	}
	/**
	 *方法: 取得holePos15
	 *@return: holePos15  穴位置15(X,Y,Z)
	 */
	
	public String getHolePos15(){
		return this.holePos15;
	}

	/**
	 *方法: 设置holePos15
	 *@param: holePos15  穴位置15(X,Y,Z)
	 */
	public void setHolePos15(String holePos15){
		this.holePos15 = holePos15;
	}
	/**
	 *方法: 取得holeCourse15
	 *@return: holeCourse15  穴向き15(X,Y,Z)
	 */
	
	public String getHoleCourse15(){
		return this.holeCourse15;
	}

	/**
	 *方法: 设置holeCourse15
	 *@param: holeCourse15  穴向き15(X,Y,Z)
	 */
	public void setHoleCourse15(String holeCourse15){
		this.holeCourse15 = holeCourse15;
	}
	/**
	 *方法: 取得holeDepth15
	 *@return: holeDepth15  穴深さ15
	 */
	
	public BigDecimal getHoleDepth15(){
		return this.holeDepth15;
	}

	/**
	 *方法: 设置holeDepth15
	 *@param: holeDepth15  穴深さ15
	 */
	public void setHoleDepth15(BigDecimal holeDepth15){
		this.holeDepth15 = holeDepth15;
	}
	/**
	 *方法: 取得fitBolt15
	 *@return: fitBolt15  適合ボルト15
	 */
	
	public String getFitBolt15(){
		return this.fitBolt15;
	}

	/**
	 *方法: 设置fitBolt15
	 *@param: fitBolt15  適合ボルト15
	 */
	public void setFitBolt15(String fitBolt15){
		this.fitBolt15 = fitBolt15;
	}
	/**
	 *方法: 取得fitNut15
	 *@return: fitNut15  適合ナット15
	 */
	
	public String getFitNut15(){
		return this.fitNut15;
	}

	/**
	 *方法: 设置fitNut15
	 *@param: fitNut15  適合ナット15
	 */
	public void setFitNut15(String fitNut15){
		this.fitNut15 = fitNut15;
	}
	/**
	 *方法: 取得fitBoltKind15
	 *@return: fitBoltKind15  適合ボルト種類15
	 */
	
	public String getFitBoltKind15(){
		return this.fitBoltKind15;
	}

	/**
	 *方法: 设置fitBoltKind15
	 *@param: fitBoltKind15  適合ボルト種類15
	 */
	public void setFitBoltKind15(String fitBoltKind15){
		this.fitBoltKind15 = fitBoltKind15;
	}
	/**
	 *方法: 取得holeKind15
	 *@return: holeKind15  穴種類15
	 */
	
	public String getHoleKind15(){
		return this.holeKind15;
	}

	/**
	 *方法: 设置holeKind15
	 *@param: holeKind15  穴種類15
	 */
	public void setHoleKind15(String holeKind15){
		this.holeKind15 = holeKind15;
	}
	/**
	 *方法: 取得holeDiameter15
	 *@return: holeDiameter15  穴径15
	 */
	
	public String getHoleDiameter15(){
		return this.holeDiameter15;
	}

	/**
	 *方法: 设置holeDiameter15
	 *@param: holeDiameter15  穴径15
	 */
	public void setHoleDiameter15(String holeDiameter15){
		this.holeDiameter15 = holeDiameter15;
	}
	/**
	 *方法: 取得accessory15
	 *@return: accessory15  付属品区分15
	 */
	
	public String getAccessory15(){
		return this.accessory15;
	}

	/**
	 *方法: 设置accessory15
	 *@param: accessory15  付属品区分15
	 */
	public void setAccessory15(String accessory15){
		this.accessory15 = accessory15;
	}
	/**
	 *方法: 取得holePos16
	 *@return: holePos16  穴位置16(X,Y,Z)
	 */
	
	public String getHolePos16(){
		return this.holePos16;
	}

	/**
	 *方法: 设置holePos16
	 *@param: holePos16  穴位置16(X,Y,Z)
	 */
	public void setHolePos16(String holePos16){
		this.holePos16 = holePos16;
	}
	/**
	 *方法: 取得holeCourse16
	 *@return: holeCourse16  穴向き16(X,Y,Z)
	 */
	
	public String getHoleCourse16(){
		return this.holeCourse16;
	}

	/**
	 *方法: 设置holeCourse16
	 *@param: holeCourse16  穴向き16(X,Y,Z)
	 */
	public void setHoleCourse16(String holeCourse16){
		this.holeCourse16 = holeCourse16;
	}
	/**
	 *方法: 取得holeDepth16
	 *@return: holeDepth16  穴深さ16
	 */
	
	public BigDecimal getHoleDepth16(){
		return this.holeDepth16;
	}

	/**
	 *方法: 设置holeDepth16
	 *@param: holeDepth16  穴深さ16
	 */
	public void setHoleDepth16(BigDecimal holeDepth16){
		this.holeDepth16 = holeDepth16;
	}
	/**
	 *方法: 取得fitBolt16
	 *@return: fitBolt16  適合ボルト16
	 */
	
	public String getFitBolt16(){
		return this.fitBolt16;
	}

	/**
	 *方法: 设置fitBolt16
	 *@param: fitBolt16  適合ボルト16
	 */
	public void setFitBolt16(String fitBolt16){
		this.fitBolt16 = fitBolt16;
	}
	/**
	 *方法: 取得fitNut16
	 *@return: fitNut16  適合ナット16
	 */
	
	public String getFitNut16(){
		return this.fitNut16;
	}

	/**
	 *方法: 设置fitNut16
	 *@param: fitNut16  適合ナット16
	 */
	public void setFitNut16(String fitNut16){
		this.fitNut16 = fitNut16;
	}
	/**
	 *方法: 取得fitBoltKind16
	 *@return: fitBoltKind16  適合ボルト種類16
	 */
	
	public String getFitBoltKind16(){
		return this.fitBoltKind16;
	}

	/**
	 *方法: 设置fitBoltKind16
	 *@param: fitBoltKind16  適合ボルト種類16
	 */
	public void setFitBoltKind16(String fitBoltKind16){
		this.fitBoltKind16 = fitBoltKind16;
	}
	/**
	 *方法: 取得holeKind16
	 *@return: holeKind16  穴種類16
	 */
	
	public String getHoleKind16(){
		return this.holeKind16;
	}

	/**
	 *方法: 设置holeKind16
	 *@param: holeKind16  穴種類16
	 */
	public void setHoleKind16(String holeKind16){
		this.holeKind16 = holeKind16;
	}
	/**
	 *方法: 取得holeDiameter16
	 *@return: holeDiameter16  穴径16
	 */
	
	public String getHoleDiameter16(){
		return this.holeDiameter16;
	}

	/**
	 *方法: 设置holeDiameter16
	 *@param: holeDiameter16  穴径16
	 */
	public void setHoleDiameter16(String holeDiameter16){
		this.holeDiameter16 = holeDiameter16;
	}
	/**
	 *方法: 取得accessory16
	 *@return: accessory16  付属品区分16
	 */
	
	public String getAccessory16(){
		return this.accessory16;
	}

	/**
	 *方法: 设置accessory16
	 *@param: accessory16  付属品区分16
	 */
	public void setAccessory16(String accessory16){
		this.accessory16 = accessory16;
	}
	/**
	 *方法: 取得holePos17
	 *@return: holePos17  穴位置17(X,Y,Z)
	 */
	
	public String getHolePos17(){
		return this.holePos17;
	}

	/**
	 *方法: 设置holePos17
	 *@param: holePos17  穴位置17(X,Y,Z)
	 */
	public void setHolePos17(String holePos17){
		this.holePos17 = holePos17;
	}
	/**
	 *方法: 取得holeCourse17
	 *@return: holeCourse17  穴向き17(X,Y,Z)
	 */
	
	public String getHoleCourse17(){
		return this.holeCourse17;
	}

	/**
	 *方法: 设置holeCourse17
	 *@param: holeCourse17  穴向き17(X,Y,Z)
	 */
	public void setHoleCourse17(String holeCourse17){
		this.holeCourse17 = holeCourse17;
	}
	/**
	 *方法: 取得holeDepth17
	 *@return: holeDepth17  穴深さ17
	 */
	
	public BigDecimal getHoleDepth17(){
		return this.holeDepth17;
	}

	/**
	 *方法: 设置holeDepth17
	 *@param: holeDepth17  穴深さ17
	 */
	public void setHoleDepth17(BigDecimal holeDepth17){
		this.holeDepth17 = holeDepth17;
	}
	/**
	 *方法: 取得fitBolt17
	 *@return: fitBolt17  適合ボルト17
	 */
	
	public String getFitBolt17(){
		return this.fitBolt17;
	}

	/**
	 *方法: 设置fitBolt17
	 *@param: fitBolt17  適合ボルト17
	 */
	public void setFitBolt17(String fitBolt17){
		this.fitBolt17 = fitBolt17;
	}
	/**
	 *方法: 取得fitNut17
	 *@return: fitNut17  適合ナット17
	 */
	
	public String getFitNut17(){
		return this.fitNut17;
	}

	/**
	 *方法: 设置fitNut17
	 *@param: fitNut17  適合ナット17
	 */
	public void setFitNut17(String fitNut17){
		this.fitNut17 = fitNut17;
	}
	/**
	 *方法: 取得fitBoltKind17
	 *@return: fitBoltKind17  適合ボルト種類17
	 */
	
	public String getFitBoltKind17(){
		return this.fitBoltKind17;
	}

	/**
	 *方法: 设置fitBoltKind17
	 *@param: fitBoltKind17  適合ボルト種類17
	 */
	public void setFitBoltKind17(String fitBoltKind17){
		this.fitBoltKind17 = fitBoltKind17;
	}
	/**
	 *方法: 取得holeKind17
	 *@return: holeKind17  穴種類17
	 */
	
	public String getHoleKind17(){
		return this.holeKind17;
	}

	/**
	 *方法: 设置holeKind17
	 *@param: holeKind17  穴種類17
	 */
	public void setHoleKind17(String holeKind17){
		this.holeKind17 = holeKind17;
	}
	/**
	 *方法: 取得holeDiameter17
	 *@return: holeDiameter17  穴径17
	 */
	
	public String getHoleDiameter17(){
		return this.holeDiameter17;
	}

	/**
	 *方法: 设置holeDiameter17
	 *@param: holeDiameter17  穴径17
	 */
	public void setHoleDiameter17(String holeDiameter17){
		this.holeDiameter17 = holeDiameter17;
	}
	/**
	 *方法: 取得accessory17
	 *@return: accessory17  付属品区分17
	 */
	
	public String getAccessory17(){
		return this.accessory17;
	}

	/**
	 *方法: 设置accessory17
	 *@param: accessory17  付属品区分17
	 */
	public void setAccessory17(String accessory17){
		this.accessory17 = accessory17;
	}
	/**
	 *方法: 取得holePos18
	 *@return: holePos18  穴位置18(X,Y,Z)
	 */
	
	public String getHolePos18(){
		return this.holePos18;
	}

	/**
	 *方法: 设置holePos18
	 *@param: holePos18  穴位置18(X,Y,Z)
	 */
	public void setHolePos18(String holePos18){
		this.holePos18 = holePos18;
	}
	/**
	 *方法: 取得holeCourse18
	 *@return: holeCourse18  穴向き18(X,Y,Z)
	 */
	
	public String getHoleCourse18(){
		return this.holeCourse18;
	}

	/**
	 *方法: 设置holeCourse18
	 *@param: holeCourse18  穴向き18(X,Y,Z)
	 */
	public void setHoleCourse18(String holeCourse18){
		this.holeCourse18 = holeCourse18;
	}
	/**
	 *方法: 取得holeDepth18
	 *@return: holeDepth18  穴深さ18
	 */
	
	public BigDecimal getHoleDepth18(){
		return this.holeDepth18;
	}

	/**
	 *方法: 设置holeDepth18
	 *@param: holeDepth18  穴深さ18
	 */
	public void setHoleDepth18(BigDecimal holeDepth18){
		this.holeDepth18 = holeDepth18;
	}
	/**
	 *方法: 取得fitBolt18
	 *@return: fitBolt18  適合ボルト18
	 */
	
	public String getFitBolt18(){
		return this.fitBolt18;
	}

	/**
	 *方法: 设置fitBolt18
	 *@param: fitBolt18  適合ボルト18
	 */
	public void setFitBolt18(String fitBolt18){
		this.fitBolt18 = fitBolt18;
	}
	/**
	 *方法: 取得fitNut18
	 *@return: fitNut18  適合ナット18
	 */
	
	public String getFitNut18(){
		return this.fitNut18;
	}

	/**
	 *方法: 设置fitNut18
	 *@param: fitNut18  適合ナット18
	 */
	public void setFitNut18(String fitNut18){
		this.fitNut18 = fitNut18;
	}
	/**
	 *方法: 取得fitBoltKind18
	 *@return: fitBoltKind18  適合ボルト種類18
	 */
	
	public String getFitBoltKind18(){
		return this.fitBoltKind18;
	}

	/**
	 *方法: 设置fitBoltKind18
	 *@param: fitBoltKind18  適合ボルト種類18
	 */
	public void setFitBoltKind18(String fitBoltKind18){
		this.fitBoltKind18 = fitBoltKind18;
	}
	/**
	 *方法: 取得holeKind18
	 *@return: holeKind18  穴種類18
	 */
	
	public String getHoleKind18(){
		return this.holeKind18;
	}

	/**
	 *方法: 设置holeKind18
	 *@param: holeKind18  穴種類18
	 */
	public void setHoleKind18(String holeKind18){
		this.holeKind18 = holeKind18;
	}
	/**
	 *方法: 取得holeDiameter18
	 *@return: holeDiameter18  穴径18
	 */
	
	public String getHoleDiameter18(){
		return this.holeDiameter18;
	}

	/**
	 *方法: 设置holeDiameter18
	 *@param: holeDiameter18  穴径18
	 */
	public void setHoleDiameter18(String holeDiameter18){
		this.holeDiameter18 = holeDiameter18;
	}
	/**
	 *方法: 取得accessory18
	 *@return: accessory18  付属品区分18
	 */
	
	public String getAccessory18(){
		return this.accessory18;
	}

	/**
	 *方法: 设置accessory18
	 *@param: accessory18  付属品区分18
	 */
	public void setAccessory18(String accessory18){
		this.accessory18 = accessory18;
	}
	/**
	 *方法: 取得addProcNgArea
	 *@return: addProcNgArea  追加工禁止領域
	 */
	
	public String getAddProcNgArea(){
		return this.addProcNgArea;
	}

	/**
	 *方法: 设置addProcNgArea
	 *@param: addProcNgArea  追加工禁止領域
	 */
	public void setAddProcNgArea(String addProcNgArea){
		this.addProcNgArea = addProcNgArea;
	}
	/**
	 *方法: 取得correspondFrame
	 *@return: correspondFrame  対応フレーム
	 */
	
	public String getCorrespondFrame(){
		return this.correspondFrame;
	}

	/**
	 *方法: 设置correspondFrame
	 *@param: correspondFrame  対応フレーム
	 */
	public void setCorrespondFrame(String correspondFrame){
		this.correspondFrame = correspondFrame;
	}
	/**
	 *方法: 取得storkTSUnitPrice
	 *@return: storkTSUnitPrice  ストークＴ売単価
	 */
	
	public String getStorkTSUnitPrice(){
		return this.storkTSUnitPrice;
	}

	/**
	 *方法: 设置storkTSUnitPrice
	 *@param: storkTSUnitPrice  ストークＴ売単価
	 */
	public void setStorkTSUnitPrice(String storkTSUnitPrice){
		this.storkTSUnitPrice = storkTSUnitPrice;
	}
	/**
	 *方法: 取得storkTPUnitPrice
	 *@return: storkTPUnitPrice  ストークＴ仕入単価
	 */
	
	public String getStorkTPUnitPrice(){
		return this.storkTPUnitPrice;
	}

	/**
	 *方法: 设置storkTPUnitPrice
	 *@param: storkTPUnitPrice  ストークＴ仕入単価
	 */
	public void setStorkTPUnitPrice(String storkTPUnitPrice){
		this.storkTPUnitPrice = storkTPUnitPrice;
	}
	/**
	 *方法: 取得storkTCatalogDays
	 *@return: storkTCatalogDays  ストークＴカタログ納期
	 */
	
	public String getStorkTCatalogDays(){
		return this.storkTCatalogDays;
	}

	/**
	 *方法: 设置storkTCatalogDays
	 *@param: storkTCatalogDays  ストークＴカタログ納期
	 */
	public void setStorkTCatalogDays(String storkTCatalogDays){
		this.storkTCatalogDays = storkTCatalogDays;
	}
	/**
	 *方法: 取得storkASUnitPrice
	 *@return: storkASUnitPrice  ストークＡ売単価
	 */
	
	public String getStorkASUnitPrice(){
		return this.storkASUnitPrice;
	}

	/**
	 *方法: 设置storkASUnitPrice
	 *@param: storkASUnitPrice  ストークＡ売単価
	 */
	public void setStorkASUnitPrice(String storkASUnitPrice){
		this.storkASUnitPrice = storkASUnitPrice;
	}
	/**
	 *方法: 取得storkAPUnitPrice
	 *@return: storkAPUnitPrice  ストークＡ仕入単価
	 */
	
	public String getStorkAPUnitPrice(){
		return this.storkAPUnitPrice;
	}

	/**
	 *方法: 设置storkAPUnitPrice
	 *@param: storkAPUnitPrice  ストークＡ仕入単価
	 */
	public void setStorkAPUnitPrice(String storkAPUnitPrice){
		this.storkAPUnitPrice = storkAPUnitPrice;
	}
	/**
	 *方法: 取得storkACatalogDays
	 *@return: storkACatalogDays  ストークＡカタログ納期
	 */
	
	public String getStorkACatalogDays(){
		return this.storkACatalogDays;
	}

	/**
	 *方法: 设置storkACatalogDays
	 *@param: storkACatalogDays  ストークＡカタログ納期
	 */
	public void setStorkACatalogDays(String storkACatalogDays){
		this.storkACatalogDays = storkACatalogDays;
	}
	/**
	 *方法: 取得storkBSUnitPrice
	 *@return: storkBSUnitPrice  ストークＢ売単価
	 */
	
	public String getStorkBSUnitPrice(){
		return this.storkBSUnitPrice;
	}

	/**
	 *方法: 设置storkBSUnitPrice
	 *@param: storkBSUnitPrice  ストークＢ売単価
	 */
	public void setStorkBSUnitPrice(String storkBSUnitPrice){
		this.storkBSUnitPrice = storkBSUnitPrice;
	}
	/**
	 *方法: 取得storkBPUnitPrice
	 *@return: storkBPUnitPrice  ストークＢ仕入単価
	 */
	
	public String getStorkBPUnitPrice(){
		return this.storkBPUnitPrice;
	}

	/**
	 *方法: 设置storkBPUnitPrice
	 *@param: storkBPUnitPrice  ストークＢ仕入単価
	 */
	public void setStorkBPUnitPrice(String storkBPUnitPrice){
		this.storkBPUnitPrice = storkBPUnitPrice;
	}
	/**
	 *方法: 取得storkBCatalogDays
	 *@return: storkBCatalogDays  ストークＢカタログ納期
	 */
	
	public String getStorkBCatalogDays(){
		return this.storkBCatalogDays;
	}

	/**
	 *方法: 设置storkBCatalogDays
	 *@param: storkBCatalogDays  ストークＢカタログ納期
	 */
	public void setStorkBCatalogDays(String storkBCatalogDays){
		this.storkBCatalogDays = storkBCatalogDays;
	}
	/**
	 *方法: 取得storkCSUnitPrice
	 *@return: storkCSUnitPrice  ストークＣ売単価
	 */
	
	public String getStorkCSUnitPrice(){
		return this.storkCSUnitPrice;
	}

	/**
	 *方法: 设置storkCSUnitPrice
	 *@param: storkCSUnitPrice  ストークＣ売単価
	 */
	public void setStorkCSUnitPrice(String storkCSUnitPrice){
		this.storkCSUnitPrice = storkCSUnitPrice;
	}
	/**
	 *方法: 取得storkCPUnitPrice
	 *@return: storkCPUnitPrice  ストークＣ仕入単価
	 */
	
	public String getStorkCPUnitPrice(){
		return this.storkCPUnitPrice;
	}

	/**
	 *方法: 设置storkCPUnitPrice
	 *@param: storkCPUnitPrice  ストークＣ仕入単価
	 */
	public void setStorkCPUnitPrice(String storkCPUnitPrice){
		this.storkCPUnitPrice = storkCPUnitPrice;
	}
	/**
	 *方法: 取得storkCCatalogDays
	 *@return: storkCCatalogDays  ストークＣカタログ納期
	 */
	
	public String getStorkCCatalogDays(){
		return this.storkCCatalogDays;
	}

	/**
	 *方法: 设置storkCCatalogDays
	 *@param: storkCCatalogDays  ストークＣカタログ納期
	 */
	public void setStorkCCatalogDays(String storkCCatalogDays){
		this.storkCCatalogDays = storkCCatalogDays;
	}
	/**
	 *方法: 取得afReserve01
	 *@return: afReserve01  タブコード
	 */
	
	public String getAfReserve01(){
		return this.afReserve01;
	}

	/**
	 *方法: 设置afReserve01
	 *@param: afReserve01  タブコード
	 */
	public void setAfReserve01(String afReserve01){
		this.afReserve01 = afReserve01;
	}
	/**
	 *方法: 取得afReserve02
	 *@return: afReserve02  予備2
	 */
	
	public String getAfReserve02(){
		return this.afReserve02;
	}

	/**
	 *方法: 设置afReserve02
	 *@param: afReserve02  予備2
	 */
	public void setAfReserve02(String afReserve02){
		this.afReserve02 = afReserve02;
	}
	/**
	 *方法: 取得afReserve03
	 *@return: afReserve03  予備3
	 */
	
	public String getAfReserve03(){
		return this.afReserve03;
	}

	/**
	 *方法: 设置afReserve03
	 *@param: afReserve03  予備3
	 */
	public void setAfReserve03(String afReserve03){
		this.afReserve03 = afReserve03;
	}
	/**
	 *方法: 取得afReserve04
	 *@return: afReserve04  予備4
	 */
	
	public String getAfReserve04(){
		return this.afReserve04;
	}

	/**
	 *方法: 设置afReserve04
	 *@param: afReserve04  予備4
	 */
	public void setAfReserve04(String afReserve04){
		this.afReserve04 = afReserve04;
	}
	/**
	 *方法: 取得afReserve05
	 *@return: afReserve05  予備5
	 */
	
	public String getAfReserve05(){
		return this.afReserve05;
	}

	/**
	 *方法: 设置afReserve05
	 *@param: afReserve05  予備5
	 */
	public void setAfReserve05(String afReserve05){
		this.afReserve05 = afReserve05;
	}
	/**
	 *方法: 取得afReserve06
	 *@return: afReserve06  予備6
	 */
	
	public String getAfReserve06(){
		return this.afReserve06;
	}

	/**
	 *方法: 设置afReserve06
	 *@param: afReserve06  予備6
	 */
	public void setAfReserve06(String afReserve06){
		this.afReserve06 = afReserve06;
	}
	/**
	 *方法: 取得afReserve07
	 *@return: afReserve07  予備7
	 */
	
	public String getAfReserve07(){
		return this.afReserve07;
	}

	/**
	 *方法: 设置afReserve07
	 *@param: afReserve07  予備7
	 */
	public void setAfReserve07(String afReserve07){
		this.afReserve07 = afReserve07;
	}
	/**
	 *方法: 取得afReserve08
	 *@return: afReserve08  予備8
	 */
	
	public String getAfReserve08(){
		return this.afReserve08;
	}

	/**
	 *方法: 设置afReserve08
	 *@param: afReserve08  予備8
	 */
	public void setAfReserve08(String afReserve08){
		this.afReserve08 = afReserve08;
	}
	/**
	 *方法: 取得afReserve09
	 *@return: afReserve09  予備9
	 */
	
	public String getAfReserve09(){
		return this.afReserve09;
	}

	/**
	 *方法: 设置afReserve09
	 *@param: afReserve09  予備9
	 */
	public void setAfReserve09(String afReserve09){
		this.afReserve09 = afReserve09;
	}
	/**
	 *方法: 取得afReserve10
	 *@return: afReserve10  予備10
	 */
	
	public String getAfReserve10(){
		return this.afReserve10;
	}

	/**
	 *方法: 设置afReserve10
	 *@param: afReserve10  予備10
	 */
	public void setAfReserve10(String afReserve10){
		this.afReserve10 = afReserve10;
	}
	/**
	 *方法: 取得recommendFlg
	 *@return: recommendFlg  新商品(おすすめ)FG
	 */
	
	public String getRecommendFlg(){
		return this.recommendFlg;
	}

	/**
	 *方法: 设置recommendFlg
	 *@param: recommendFlg  新商品(おすすめ)FG
	 */
	public void setRecommendFlg(String recommendFlg){
		this.recommendFlg = recommendFlg;
	}
	/**
	 *方法: 取得stockoutReason
	 *@return: stockoutReason  取り扱いなし理由
	 */
	
	public String getStockoutReason(){
		return this.stockoutReason;
	}

	/**
	 *方法: 设置stockoutReason
	 *@param: stockoutReason  取り扱いなし理由
	 */
	public void setStockoutReason(String stockoutReason){
		this.stockoutReason = stockoutReason;
	}
	/**
	 *方法: 取得updateNo
	 *@return: updateNo  更新管理No
	 */
	
	public Long getUpdateNo(){
		return this.updateNo;
	}

	/**
	 *方法: 设置updateNo
	 *@param: updateNo  更新管理No
	 */
	public void setUpdateNo(Long updateNo){
		this.updateNo = updateNo;
	}
	/**
	 *方法: 取得delFlg
	 *@return: delFlg  削除フラグ
	 */
	
	public String getDelFlg(){
		return this.delFlg;
	}

	/**
	 *方法: 设置delFlg
	 *@param: delFlg  削除フラグ
	 */
	public void setDelFlg(String delFlg){
		this.delFlg = delFlg;
	}
	/**
	 *方法: 取得updateUserId
	 *@return: updateUserId  更新ユーザID
	 */
	
	public String getUpdateUserId(){
		return this.updateUserId;
	}

	/**
	 *方法: 设置updateUserId
	 *@param: updateUserId  更新ユーザID
	 */
	public void setUpdateUserId(String updateUserId){
		this.updateUserId = updateUserId;
	}
	/**
	 *方法: 取得regSysTime
	 *@return: regSysTime  登録日時（システム日時）
	 */
	
	public String getRegSysTime(){
		return this.regSysTime;
	}

	/**
	 *方法: 设置regSysTime
	 *@param: regSysTime  登録日時（システム日時）
	 */
	public void setRegSysTime(String regSysTime){
		this.regSysTime = regSysTime;
	}
	/**
	 *方法: 取得updSysTime
	 *@return: updSysTime  更新日時（システム日時）
	 */
	
	public String getUpdSysTime(){
		return this.updSysTime;
	}

	/**
	 *方法: 设置updSysTime
	 *@param: updSysTime  更新日時（システム日時）
	 */
	public void setUpdSysTime(String updSysTime){
		this.updSysTime = updSysTime;
	}
	
	@Override
	public String toString() {
		return "AfProductDetail [ subsidiaryCd=" + subsidiaryCd + ", innerCd=" + innerCd + ", categoryName=" + categoryName + ", categoryCd=" + categoryCd + ", combiCategoryCd=" + combiCategoryCd + ", brandCd=" + brandCd + ", fullProductCd=" + fullProductCd + ", baseProductCd=" + baseProductCd + ", ntvProductName=" + ntvProductName + ", productManual=" + productManual + ", series=" + series + ", type=" + type + ", surfaceFinish=" + surfaceFinish + ", catalogDays=" + catalogDays + ", fluteColumn=" + fluteColumn + ", fluteSurface=" + fluteSurface + ", edgeNum=" + edgeNum + ", color=" + color + ", weight=" + weight + ", sectionalArea=" + sectionalArea + ", allowableLoad=" + allowableLoad + ", wheelMaterial=" + wheelMaterial + ", wheelOutDiameter=" + wheelOutDiameter + ", supplierCd=" + supplierCd + ", qRankDiv=" + qRankDiv + ", panelThickness=" + panelThickness + ", angle=" + angle + ", diffShapeFlg=" + diffShapeFlg + ", baseFrameWidth=" + baseFrameWidth + ", addProcFlg=" + addProcFlg + ", blacketCHole=" + blacketCHole + ", momentLx=" + momentLx + ", momentLy=" + momentLy + ", youngsModulus=" + youngsModulus + ", adaptSeries=" + adaptSeries + ", adaptEdgeNum=" + adaptEdgeNum + ", jointLimit=" + jointLimit + ", fitMDiameter=" + fitMDiameter + ", fitBoltSize=" + fitBoltSize + ", fitBoltKind=" + fitBoltKind + ", fixMethod=" + fixMethod + ", material=" + material + ", powerSingleBolt=" + powerSingleBolt + ", airVolume=" + airVolume + ", productUrl=" + productUrl + ", userFlg=" + userFlg + ", boardThickness=" + boardThickness + ", maxSize=" + maxSize + ", minSize=" + minSize + ", pitchSize=" + pitchSize + ", fixLenSales=" + fixLenSales + ", fluteLeft=" + fluteLeft + ", fluteRight=" + fluteRight + ", fluteUp=" + fluteUp + ", fluteDown=" + fluteDown + ", flutePitchLeft=" + flutePitchLeft + ", flutePitchRight=" + flutePitchRight + ", flutePitchUp=" + flutePitchUp + ", flutePitchDown=" + flutePitchDown + ", flatPos=" + flatPos + ", shape=" + shape + ", crossFeasibility=" + crossFeasibility + ", symmetryXy=" + symmetryXy + ", symmetryZ=" + symmetryZ + ", protuberanceX=" + protuberanceX + ", protuberanceY=" + protuberanceY + ", jointPos=" + jointPos + ", jointPattern=" + jointPattern + ", essentialFlutePos=" + essentialFlutePos + ", coreSide=" + coreSide + ", jointOkCategoryCd=" + jointOkCategoryCd + ", seriesLeftEdge=" + seriesLeftEdge + ", seriesRightEdge=" + seriesRightEdge + ", hingeLr=" + hingeLr + ", holePos1=" + holePos1 + ", holeCourse1=" + holeCourse1 + ", holeDepth1=" + holeDepth1 + ", fitBolt1=" + fitBolt1 + ", fitNut1=" + fitNut1 + ", fitBoltKind1=" + fitBoltKind1 + ", holeKind1=" + holeKind1 + ", holeDiameter1=" + holeDiameter1 + ", accessory1=" + accessory1 + ", holePos2=" + holePos2 + ", holeCourse2=" + holeCourse2 + ", holeDepth2=" + holeDepth2 + ", fitBolt2=" + fitBolt2 + ", fitNut2=" + fitNut2 + ", fitBoltKind2=" + fitBoltKind2 + ", holeKind2=" + holeKind2 + ", holeDiameter2=" + holeDiameter2 + ", accessory2=" + accessory2 + ", holePos3=" + holePos3 + ", holeCourse3=" + holeCourse3 + ", holeDepth3=" + holeDepth3 + ", fitBolt3=" + fitBolt3 + ", fitNut3=" + fitNut3 + ", fitBoltKind3=" + fitBoltKind3 + ", holeKind3=" + holeKind3 + ", holeDiameter3=" + holeDiameter3 + ", accessory3=" + accessory3 + ", holePos4=" + holePos4 + ", holeCourse4=" + holeCourse4 + ", holeDepth4=" + holeDepth4 + ", fitBolt4=" + fitBolt4 + ", fitNut4=" + fitNut4 + ", fitBoltKind4=" + fitBoltKind4 + ", holeKind4=" + holeKind4 + ", holeDiameter4=" + holeDiameter4 + ", accessory4=" + accessory4 + ", holePos5=" + holePos5 + ", holeCourse5=" + holeCourse5 + ", holeDepth5=" + holeDepth5 + ", fitBolt5=" + fitBolt5 + ", fitNut5=" + fitNut5 + ", fitBoltKind5=" + fitBoltKind5 + ", holeKind5=" + holeKind5 + ", holeDiameter5=" + holeDiameter5 + ", accessory5=" + accessory5 + ", holePos6=" + holePos6 + ", holeCourse6=" + holeCourse6 + ", holeDepth6=" + holeDepth6 + ", fitBolt6=" + fitBolt6 + ", fitNut6=" + fitNut6 + ", fitBoltKind6=" + fitBoltKind6 + ", holeKind6=" + holeKind6 + ", holeDiameter6=" + holeDiameter6 + ", accessory6=" + accessory6 + ", holePos7=" + holePos7 + ", holeCourse7=" + holeCourse7 + ", holeDepth7=" + holeDepth7 + ", fitBolt7=" + fitBolt7 + ", fitNut7=" + fitNut7 + ", fitBoltKind7=" + fitBoltKind7 + ", holeKind7=" + holeKind7 + ", holeDiameter7=" + holeDiameter7 + ", accessory7=" + accessory7 + ", holePos8=" + holePos8 + ", holeCourse8=" + holeCourse8 + ", holeDepth8=" + holeDepth8 + ", fitBolt8=" + fitBolt8 + ", fitNut8=" + fitNut8 + ", fitBoltKind8=" + fitBoltKind8 + ", holeKind8=" + holeKind8 + ", holeDiameter8=" + holeDiameter8 + ", accessory8=" + accessory8 + ", holePos9=" + holePos9 + ", holeCourse9=" + holeCourse9 + ", holeDepth9=" + holeDepth9 + ", fitBolt9=" + fitBolt9 + ", fitNut9=" + fitNut9 + ", fitBoltKind9=" + fitBoltKind9 + ", holeKind9=" + holeKind9 + ", holeDiameter9=" + holeDiameter9 + ", accessory9=" + accessory9 + ", holePos10=" + holePos10 + ", holeCourse10=" + holeCourse10 + ", holeDepth10=" + holeDepth10 + ", fitBolt10=" + fitBolt10 + ", fitNut10=" + fitNut10 + ", fitBoltKind10=" + fitBoltKind10 + ", holeKind10=" + holeKind10 + ", holeDiameter10=" + holeDiameter10 + ", accessory10=" + accessory10 + ", holePos11=" + holePos11 + ", holeCourse11=" + holeCourse11 + ", holeDepth11=" + holeDepth11 + ", fitBolt11=" + fitBolt11 + ", fitNut11=" + fitNut11 + ", fitBoltKind11=" + fitBoltKind11 + ", holeKind11=" + holeKind11 + ", holeDiameter11=" + holeDiameter11 + ", accessory11=" + accessory11 + ", holePos12=" + holePos12 + ", holeCourse12=" + holeCourse12 + ", holeDepth12=" + holeDepth12 + ", fitBolt12=" + fitBolt12 + ", fitNut12=" + fitNut12 + ", fitBoltKind12=" + fitBoltKind12 + ", holeKind12=" + holeKind12 + ", holeDiameter12=" + holeDiameter12 + ", accessory12=" + accessory12 + ", holePos13=" + holePos13 + ", holeCourse13=" + holeCourse13 + ", holeDepth13=" + holeDepth13 + ", fitBolt13=" + fitBolt13 + ", fitNut13=" + fitNut13 + ", fitBoltKind13=" + fitBoltKind13 + ", holeKind13=" + holeKind13 + ", holeDiameter13=" + holeDiameter13 + ", accessory13=" + accessory13 + ", holePos14=" + holePos14 + ", holeCourse14=" + holeCourse14 + ", holeDepth14=" + holeDepth14 + ", fitBolt14=" + fitBolt14 + ", fitNut14=" + fitNut14 + ", fitBoltKind14=" + fitBoltKind14 + ", holeKind14=" + holeKind14 + ", holeDiameter14=" + holeDiameter14 + ", accessory14=" + accessory14 + ", holePos15=" + holePos15 + ", holeCourse15=" + holeCourse15 + ", holeDepth15=" + holeDepth15 + ", fitBolt15=" + fitBolt15 + ", fitNut15=" + fitNut15 + ", fitBoltKind15=" + fitBoltKind15 + ", holeKind15=" + holeKind15 + ", holeDiameter15=" + holeDiameter15 + ", accessory15=" + accessory15 + ", holePos16=" + holePos16 + ", holeCourse16=" + holeCourse16 + ", holeDepth16=" + holeDepth16 + ", fitBolt16=" + fitBolt16 + ", fitNut16=" + fitNut16 + ", fitBoltKind16=" + fitBoltKind16 + ", holeKind16=" + holeKind16 + ", holeDiameter16=" + holeDiameter16 + ", accessory16=" + accessory16 + ", holePos17=" + holePos17 + ", holeCourse17=" + holeCourse17 + ", holeDepth17=" + holeDepth17 + ", fitBolt17=" + fitBolt17 + ", fitNut17=" + fitNut17 + ", fitBoltKind17=" + fitBoltKind17 + ", holeKind17=" + holeKind17 + ", holeDiameter17=" + holeDiameter17 + ", accessory17=" + accessory17 + ", holePos18=" + holePos18 + ", holeCourse18=" + holeCourse18 + ", holeDepth18=" + holeDepth18 + ", fitBolt18=" + fitBolt18 + ", fitNut18=" + fitNut18 + ", fitBoltKind18=" + fitBoltKind18 + ", holeKind18=" + holeKind18 + ", holeDiameter18=" + holeDiameter18 + ", accessory18=" + accessory18 + ", addProcNgArea=" + addProcNgArea + ", correspondFrame=" + correspondFrame + ", storkTSUnitPrice=" + storkTSUnitPrice + ", storkTPUnitPrice=" + storkTPUnitPrice + ", storkTCatalogDays=" + storkTCatalogDays + ", storkASUnitPrice=" + storkASUnitPrice + ", storkAPUnitPrice=" + storkAPUnitPrice + ", storkACatalogDays=" + storkACatalogDays + ", storkBSUnitPrice=" + storkBSUnitPrice + ", storkBPUnitPrice=" + storkBPUnitPrice + ", storkBCatalogDays=" + storkBCatalogDays + ", storkCSUnitPrice=" + storkCSUnitPrice + ", storkCPUnitPrice=" + storkCPUnitPrice + ", storkCCatalogDays=" + storkCCatalogDays + ", afReserve01=" + afReserve01 + ", afReserve02=" + afReserve02 + ", afReserve03=" + afReserve03 + ", afReserve04=" + afReserve04 + ", afReserve05=" + afReserve05 + ", afReserve06=" + afReserve06 + ", afReserve07=" + afReserve07 + ", afReserve08=" + afReserve08 + ", afReserve09=" + afReserve09 + ", afReserve10=" + afReserve10 + ", recommendFlg=" + recommendFlg + ", stockoutReason=" + stockoutReason + ", updateNo=" + updateNo + ", delFlg=" + delFlg + ", updateUserId=" + updateUserId + ", regSysTime=" + regSysTime + ", updSysTime=" + updSysTime +  "]";
	}
}
