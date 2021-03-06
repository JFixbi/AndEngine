package org.andengine.entity.sprite.batch;

import org.andengine.opengl.shader.ShaderProgram;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.vbo.VertexBufferObject.DrawType;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 21:48:21 - 27.07.2011
 */
public abstract class DynamicSpriteBatch extends SpriteBatch {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public DynamicSpriteBatch(final ITexture pTexture, final int pCapacity) {
		super(pTexture, pCapacity, DrawType.DYNAMIC);
	}

	public DynamicSpriteBatch(final float pX, final float pY, final ITexture pTexture, final int pCapacity) {
		super(pX, pY, pTexture, pCapacity, DrawType.DYNAMIC);
	}

	public DynamicSpriteBatch(final ITexture pTexture, final int pCapacity, final DrawType pDrawType) {
		super(pTexture, pCapacity, pDrawType);
	}

	public DynamicSpriteBatch(final float pX, final float pY, final ITexture pTexture, final int pCapacity, final DrawType pDrawType) {
		super(pX, pY, pTexture, pCapacity, pDrawType);
	}

	public DynamicSpriteBatch(final ITexture pTexture, final int pCapacity, final ShaderProgram pShaderProgram) {
		super(pTexture, pCapacity, DrawType.DYNAMIC, pShaderProgram);
	}

	public DynamicSpriteBatch(final float pX, final float pY, final ITexture pTexture, final int pCapacity, final ShaderProgram pShaderProgram) {
		super(pX, pY, pTexture, pCapacity, DrawType.DYNAMIC, pShaderProgram);
	}

	public DynamicSpriteBatch(final ITexture pTexture, final int pCapacity, final ISpriteBatchVertexBufferObject pSpriteBatchVertexBufferObject) {
		super(pTexture, pCapacity, pSpriteBatchVertexBufferObject);
	}

	public DynamicSpriteBatch(final float pX, final float pY, final ITexture pTexture, final int pCapacity, final ISpriteBatchVertexBufferObject pSpriteBatchVertexBufferObject) {
		super(pX, pY, pTexture, pCapacity, pSpriteBatchVertexBufferObject);
	}

	public DynamicSpriteBatch(final ITexture pTexture, final int pCapacity, final DrawType pDrawType, final ShaderProgram pShaderProgram) {
		super(pTexture, pCapacity, pDrawType, pShaderProgram);
	}

	public DynamicSpriteBatch(final float pX, final float pY, final ITexture pTexture, final int pCapacity, final DrawType pDrawType, final ShaderProgram pShaderProgram) {
		super(pX, pY, pTexture, pCapacity, pDrawType, pShaderProgram);
	}

	public DynamicSpriteBatch(final ITexture pTexture, final int pCapacity, final ISpriteBatchVertexBufferObject pSpriteBatchVertexBufferObject, final ShaderProgram pShaderProgram) {
		super(pTexture, pCapacity, pSpriteBatchVertexBufferObject, pShaderProgram);
	}

	public DynamicSpriteBatch(final float pX, final float pY, final ITexture pTexture, final int pCapacity, final ISpriteBatchVertexBufferObject pSpriteBatchVertexBufferObject, final ShaderProgram pShaderProgram) {
		super(pX, pY, pTexture, pCapacity, pSpriteBatchVertexBufferObject, pShaderProgram);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	/**
	 * @return <code>true</code> to submit, if you made any changes, or <code>false</code> otherwise.
	 */
	protected abstract boolean onUpdateSpriteBatch();

	@Override
	protected void begin() {
		super.begin();

		if(this.onUpdateSpriteBatch()) {
			this.submit();
		}
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
