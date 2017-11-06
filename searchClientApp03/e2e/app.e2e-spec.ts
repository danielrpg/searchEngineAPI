import { SearchClientApp03Page } from './app.po';

describe('search-client-app03 App', () => {
  let page: SearchClientApp03Page;

  beforeEach(() => {
    page = new SearchClientApp03Page();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
